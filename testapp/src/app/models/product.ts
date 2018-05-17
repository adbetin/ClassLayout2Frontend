interface IProduct {  
    _id?: string;  
    name : string;
    description: string;
    code: string;
    unitPrice : number;
}

export class Product {
    public _id?: string;  
    public name : string;
    public description: string;
    public code: string;
    public unitPrice : number;

    constructor(obj?: IProduct) {    
        this._id = obj && obj._id || "";
        this.name = obj && obj.name || "";
        this.description = obj && obj.description || "";
        this.code = obj && obj.code || "";
        this.unitPrice = obj && obj.unitPrice || 0;
    }
}
