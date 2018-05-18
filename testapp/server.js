var express = require("express");
var bodyParser = require("body-parser");
var mongodb = require("mongodb");
var ObjectID = mongodb.ObjectID;

var PRODUCT_COLLECTION = "product";
var PRODUCTCATEGORY_COLLECTION = "productcategory";
var BRAND_COLLECTION = "brand";

var app = express();
app.use(bodyParser.json());

// Create link to Angular build directory
var distDir = __dirname + "/dist/";
app.use(express.static(distDir));

// Create a database variable outside of the database connection callback to reuse the connection pool in your app.
var db;

// Connect to the database before starting the application server.
mongodb.MongoClient.connect(process.env.MONGODB_URI || "mongodb://testapp:testapp123@ds247619.mlab.com:47619/heroku_b7vllf1p", function (err, client) {
  if (err) {
    console.log(err);
    process.exit(1);
  }

  // Save database object from the callback for reuse.
  db = client.db();
  console.log("Database connection ready");

  // Initialize the app.
  var server = app.listen(process.env.PORT || 8080, function () {
    var port = server.address().port;
    console.log("App now running on port", port);
  });
});

// manejador de errores generico utilizado por todos los servicios
function handleError(res, reason, message, code) {
    console.log("ERROR: " + reason);
    res.status(code || 500).json({ "error": message });
}

// se agrega cors para permitir acceder a los servicios desde cualquier dominio
app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
  });

// PRODUCT API ROUTES BELOW

/*  "/api/product"
 *    GET: finds all product
 *    POST: creates a new product
 */

app.get("/api/product", function (req, res) {
    var query = {};
    var nameFilter = req.query.name;

    if (!!nameFilter) {
        query.name = { "$regex": ".*" + nameFilter + ".*", "$options": "i" }
    }

    db.collection(PRODUCT_COLLECTION).find(query).toArray(function (err, docs) {
        if (err) {
            console.log(err);
            handleError(res, err.message, "Failed to get product collection");
        } else {
            res.status(200).json(docs);
        }
    });
});

app.post("/api/product", function (req, res) {
    var newProduct = req.body;

    if (!req.body.name) {
        handleError(res, "Invalid user input", "Must provide a name.", 400);
    }

    db.collection(PRODUCT_COLLECTION).insertOne(newProduct, function (err, doc) {
        if (err) {
            handleError(res, err.message, "Failed to create new product.");
        } else {
            res.status(201).json(doc.ops[0]);
        }
    });
});

/*  "/api/product/:id"
 *    GET: find product by id
 *    PUT: update product by id
 *    DELETE: deletes product by id
 */

app.get("/api/product/:id", function (req, res) {
    db.collection(PRODUCT_COLLECTION).findOne({ _id: new ObjectID(req.params.id) }, function (err, doc) {
        if (err) {
            handleError(res, err.message, "Failed to get product");
        } else {
            res.status(200).json(doc);
        }
    });
});

app.put("/api/product/:id", function (req, res) {
    var updateDoc = req.body;
    delete updateDoc._id;

    db.collection(PRODUCT_COLLECTION).updateOne({ _id: new ObjectID(req.params.id) }, updateDoc, function (err, doc) {
        if (err) {
            handleError(res, err.message, "Failed to update product");
        } else {
            updateDoc._id = req.params.id;
            res.status(200).json(updateDoc);
        }
    });
});

app.delete("/api/product/:id", function (req, res) {
    db.collection(PRODUCT_COLLECTION).deleteOne({ _id: new ObjectID(req.params.id) }, function (err, result) {
        if (err) {
            handleError(res, err.message, "Failed to delete product");
        } else {
            res.status(200).json(req.params.id);
        }
    });
});


app.get("/api/productcategory", function (req, res) {
    var urlquery = req.query;
    var query = {};
    var nameFilter = urlquery.name;

    if (!!nameFilter) {
        query.name = { "$regex": ".*" + nameFilter + ".*", "$options": "i" }
    }

    db.collection(PRODUCT_CATEGORY_COLLECTION).find(query).toArray(function (err, docs) {
        if (err) {
            console.log(err);
            handleError(res, err.message, "Failed to get productcategory collection");
        } else {
            res.status(200).json(docs);
        }
    });
});

app.get("/api/brands", function (req, res) {
    var urlquery = req.query;
    var query = {};
    var nameFilter = urlquery.name;

    if (!!nameFilter) {
        query.name = { "$regex": ".*" + nameFilter + ".*", "$options": "i" }
    }

    db.collection(BRANDS_COLLECTION).find(query).toArray(function (err, docs) {
        if (err) {
            console.log(err);
            handleError(res, err.message, "Failed to get brands.");
        } else {
            res.status(200).json(docs);
        }
    });
});