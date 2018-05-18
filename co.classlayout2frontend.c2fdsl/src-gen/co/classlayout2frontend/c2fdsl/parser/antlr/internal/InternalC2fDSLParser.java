package co.classlayout2frontend.c2fdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.classlayout2frontend.c2fdsl.services.C2fDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalC2fDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BRACESOPEN", "RULE_COLON", "RULE_COMMA", "RULE_BRACKETSO", "RULE_BRACKETSC", "RULE_BRACESCLOSE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'entityModel'", "'site'", "'components'", "'pages'", "'elements'", "'templateColor'", "'displayName'", "'layoutType'", "'elementViews'", "'composition'", "'required'", "'many'", "'description'", "'target'", "'property'", "'defaultValue'", "'dataType'", "'class'", "'superclass'", "'primitive'", "'value'", "'enum'", "'literals'", "'reference'", "'true'", "'false'", "'-'", "'multiple'", "'label'", "'dropDownList'", "'image'", "'width'", "'height'", "'list'", "'inputText'", "'multiline'", "'staticContainer'", "'entity'", "'textArea'", "'isTitle'", "'iterationContainer'", "'iterationFilters'", "'inputForm'", "'checkList'", "'radio'", "'.'", "'E'", "'e'", "'input'", "'SINGLE_COLUMN'", "'TWO_COLUMNS'", "'LEFT_BAR'", "'RIGHT_BAR'", "'THREE_COLUMNS'"
    };
    public static final int RULE_BRACESCLOSE=9;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_BRACKETSO=7;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int RULE_COMMA=6;
    public static final int RULE_COLON=5;
    public static final int RULE_BRACKETSC=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_QUOTE=13;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_BRACESOPEN=4;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalC2fDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalC2fDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalC2fDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalC2fDSL.g"; }



     	private C2fDSLGrammarAccess grammarAccess;

        public InternalC2fDSLParser(TokenStream input, C2fDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Project";
       	}

       	@Override
       	protected C2fDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProject"
    // InternalC2fDSL.g:65:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalC2fDSL.g:65:48: (iv_ruleProject= ruleProject EOF )
            // InternalC2fDSL.g:66:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalC2fDSL.g:72:1: ruleProject returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'components' this_COLON_15= RULE_COLON this_BRACKETSO_16= RULE_BRACKETSO ( (lv_containerViews_17_0= ruleContainerView ) ) (this_COMMA_18= RULE_COMMA ( (lv_containerViews_19_0= ruleContainerView ) ) )* this_BRACKETSC_20= RULE_BRACKETSC this_COMMA_21= RULE_COMMA otherlv_22= 'pages' this_COLON_23= RULE_COLON this_BRACKETSO_24= RULE_BRACKETSO ( (lv_pageViews_25_0= rulePageView ) ) (this_COMMA_26= RULE_COMMA ( (lv_pageViews_27_0= rulePageView ) ) )* this_BRACKETSC_28= RULE_BRACKETSC this_BRACESCLOSE_29= RULE_BRACESCLOSE ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_BRACKETSO_16=null;
        Token this_COMMA_18=null;
        Token this_BRACKETSC_20=null;
        Token this_COMMA_21=null;
        Token otherlv_22=null;
        Token this_COLON_23=null;
        Token this_BRACKETSO_24=null;
        Token this_COMMA_26=null;
        Token this_BRACKETSC_28=null;
        Token this_BRACESCLOSE_29=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_entitiesmodel_8_0 = null;

        EObject lv_siteViews_12_0 = null;

        EObject lv_containerViews_17_0 = null;

        EObject lv_containerViews_19_0 = null;

        EObject lv_pageViews_25_0 = null;

        EObject lv_pageViews_27_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:78:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'components' this_COLON_15= RULE_COLON this_BRACKETSO_16= RULE_BRACKETSO ( (lv_containerViews_17_0= ruleContainerView ) ) (this_COMMA_18= RULE_COMMA ( (lv_containerViews_19_0= ruleContainerView ) ) )* this_BRACKETSC_20= RULE_BRACKETSC this_COMMA_21= RULE_COMMA otherlv_22= 'pages' this_COLON_23= RULE_COLON this_BRACKETSO_24= RULE_BRACKETSO ( (lv_pageViews_25_0= rulePageView ) ) (this_COMMA_26= RULE_COMMA ( (lv_pageViews_27_0= rulePageView ) ) )* this_BRACKETSC_28= RULE_BRACKETSC this_BRACESCLOSE_29= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:79:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'components' this_COLON_15= RULE_COLON this_BRACKETSO_16= RULE_BRACKETSO ( (lv_containerViews_17_0= ruleContainerView ) ) (this_COMMA_18= RULE_COMMA ( (lv_containerViews_19_0= ruleContainerView ) ) )* this_BRACKETSC_20= RULE_BRACKETSC this_COMMA_21= RULE_COMMA otherlv_22= 'pages' this_COLON_23= RULE_COLON this_BRACKETSO_24= RULE_BRACKETSO ( (lv_pageViews_25_0= rulePageView ) ) (this_COMMA_26= RULE_COMMA ( (lv_pageViews_27_0= rulePageView ) ) )* this_BRACKETSC_28= RULE_BRACKETSC this_BRACESCLOSE_29= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:79:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'components' this_COLON_15= RULE_COLON this_BRACKETSO_16= RULE_BRACKETSO ( (lv_containerViews_17_0= ruleContainerView ) ) (this_COMMA_18= RULE_COMMA ( (lv_containerViews_19_0= ruleContainerView ) ) )* this_BRACKETSC_20= RULE_BRACKETSC this_COMMA_21= RULE_COMMA otherlv_22= 'pages' this_COLON_23= RULE_COLON this_BRACKETSO_24= RULE_BRACKETSO ( (lv_pageViews_25_0= rulePageView ) ) (this_COMMA_26= RULE_COMMA ( (lv_pageViews_27_0= rulePageView ) ) )* this_BRACKETSC_28= RULE_BRACKETSC this_BRACESCLOSE_29= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:80:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'components' this_COLON_15= RULE_COLON this_BRACKETSO_16= RULE_BRACKETSO ( (lv_containerViews_17_0= ruleContainerView ) ) (this_COMMA_18= RULE_COMMA ( (lv_containerViews_19_0= ruleContainerView ) ) )* this_BRACKETSC_20= RULE_BRACKETSC this_COMMA_21= RULE_COMMA otherlv_22= 'pages' this_COLON_23= RULE_COLON this_BRACKETSO_24= RULE_BRACKETSO ( (lv_pageViews_25_0= rulePageView ) ) (this_COMMA_26= RULE_COMMA ( (lv_pageViews_27_0= rulePageView ) ) )* this_BRACKETSC_28= RULE_BRACKETSC this_BRACESCLOSE_29= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:80:3: ()
            // InternalC2fDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getProjectAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getProjectAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:99:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:100:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:100:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:101:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_7); 

            			newLeafNode(this_COMMA_5, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getEntityModelKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_7, grammarAccess.getProjectAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalC2fDSL.g:130:3: ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) )
            // InternalC2fDSL.g:131:4: (lv_entitiesmodel_8_0= ruleEntitiesModel )
            {
            // InternalC2fDSL.g:131:4: (lv_entitiesmodel_8_0= ruleEntitiesModel )
            // InternalC2fDSL.g:132:5: lv_entitiesmodel_8_0= ruleEntitiesModel
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getEntitiesmodelEntitiesModelParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_entitiesmodel_8_0=ruleEntitiesModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"entitiesmodel",
            						lv_entitiesmodel_8_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EntitiesModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_9); 

            			newLeafNode(this_COMMA_9, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getSiteKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_8); 

            			newLeafNode(this_COLON_11, grammarAccess.getProjectAccess().getCOLONTerminalRuleCall_11());
            		
            // InternalC2fDSL.g:161:3: ( (lv_siteViews_12_0= ruleSiteView ) )
            // InternalC2fDSL.g:162:4: (lv_siteViews_12_0= ruleSiteView )
            {
            // InternalC2fDSL.g:162:4: (lv_siteViews_12_0= ruleSiteView )
            // InternalC2fDSL.g:163:5: lv_siteViews_12_0= ruleSiteView
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getSiteViewsSiteViewParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_siteViews_12_0=ruleSiteView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"siteViews",
            						lv_siteViews_12_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.SiteView");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_10); 

            			newLeafNode(this_COMMA_13, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_13());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getComponentsKeyword_14());
            		
            this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_15, grammarAccess.getProjectAccess().getCOLONTerminalRuleCall_15());
            		
            this_BRACKETSO_16=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_16, grammarAccess.getProjectAccess().getBRACKETSOTerminalRuleCall_16());
            		
            // InternalC2fDSL.g:196:3: ( (lv_containerViews_17_0= ruleContainerView ) )
            // InternalC2fDSL.g:197:4: (lv_containerViews_17_0= ruleContainerView )
            {
            // InternalC2fDSL.g:197:4: (lv_containerViews_17_0= ruleContainerView )
            // InternalC2fDSL.g:198:5: lv_containerViews_17_0= ruleContainerView
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getContainerViewsContainerViewParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_12);
            lv_containerViews_17_0=ruleContainerView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"containerViews",
            						lv_containerViews_17_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.ContainerView");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:215:3: (this_COMMA_18= RULE_COMMA ( (lv_containerViews_19_0= ruleContainerView ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalC2fDSL.g:216:4: this_COMMA_18= RULE_COMMA ( (lv_containerViews_19_0= ruleContainerView ) )
            	    {
            	    this_COMMA_18=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_18, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_18_0());
            	    			
            	    // InternalC2fDSL.g:220:4: ( (lv_containerViews_19_0= ruleContainerView ) )
            	    // InternalC2fDSL.g:221:5: (lv_containerViews_19_0= ruleContainerView )
            	    {
            	    // InternalC2fDSL.g:221:5: (lv_containerViews_19_0= ruleContainerView )
            	    // InternalC2fDSL.g:222:6: lv_containerViews_19_0= ruleContainerView
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getContainerViewsContainerViewParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_containerViews_19_0=ruleContainerView();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"containerViews",
            	    							lv_containerViews_19_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.ContainerView");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_BRACKETSC_20=(Token)match(input,RULE_BRACKETSC,FOLLOW_6); 

            			newLeafNode(this_BRACKETSC_20, grammarAccess.getProjectAccess().getBRACKETSCTerminalRuleCall_19());
            		
            this_COMMA_21=(Token)match(input,RULE_COMMA,FOLLOW_13); 

            			newLeafNode(this_COMMA_21, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_20());
            		
            otherlv_22=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getProjectAccess().getPagesKeyword_21());
            		
            this_COLON_23=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_23, grammarAccess.getProjectAccess().getCOLONTerminalRuleCall_22());
            		
            this_BRACKETSO_24=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_24, grammarAccess.getProjectAccess().getBRACKETSOTerminalRuleCall_23());
            		
            // InternalC2fDSL.g:260:3: ( (lv_pageViews_25_0= rulePageView ) )
            // InternalC2fDSL.g:261:4: (lv_pageViews_25_0= rulePageView )
            {
            // InternalC2fDSL.g:261:4: (lv_pageViews_25_0= rulePageView )
            // InternalC2fDSL.g:262:5: lv_pageViews_25_0= rulePageView
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getPageViewsPageViewParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_12);
            lv_pageViews_25_0=rulePageView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"pageViews",
            						lv_pageViews_25_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.PageView");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:279:3: (this_COMMA_26= RULE_COMMA ( (lv_pageViews_27_0= rulePageView ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalC2fDSL.g:280:4: this_COMMA_26= RULE_COMMA ( (lv_pageViews_27_0= rulePageView ) )
            	    {
            	    this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_26, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_25_0());
            	    			
            	    // InternalC2fDSL.g:284:4: ( (lv_pageViews_27_0= rulePageView ) )
            	    // InternalC2fDSL.g:285:5: (lv_pageViews_27_0= rulePageView )
            	    {
            	    // InternalC2fDSL.g:285:5: (lv_pageViews_27_0= rulePageView )
            	    // InternalC2fDSL.g:286:6: lv_pageViews_27_0= rulePageView
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getPageViewsPageViewParserRuleCall_25_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_pageViews_27_0=rulePageView();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pageViews",
            	    							lv_pageViews_27_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.PageView");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_BRACKETSC_28=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

            			newLeafNode(this_BRACKETSC_28, grammarAccess.getProjectAccess().getBRACKETSCTerminalRuleCall_26());
            		
            this_BRACESCLOSE_29=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_29, grammarAccess.getProjectAccess().getBRACESCLOSETerminalRuleCall_27());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleContainerView"
    // InternalC2fDSL.g:316:1: entryRuleContainerView returns [EObject current=null] : iv_ruleContainerView= ruleContainerView EOF ;
    public final EObject entryRuleContainerView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerView = null;


        try {
            // InternalC2fDSL.g:316:54: (iv_ruleContainerView= ruleContainerView EOF )
            // InternalC2fDSL.g:317:2: iv_ruleContainerView= ruleContainerView EOF
            {
             newCompositeNode(grammarAccess.getContainerViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerView=ruleContainerView();

            state._fsp--;

             current =iv_ruleContainerView; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerView"


    // $ANTLR start "ruleContainerView"
    // InternalC2fDSL.g:323:1: ruleContainerView returns [EObject current=null] : (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm ) ;
    public final EObject ruleContainerView() throws RecognitionException {
        EObject current = null;

        EObject this_StaticContainer_0 = null;

        EObject this_IterationContainer_1 = null;

        EObject this_InputForm_2 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:329:2: ( (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm ) )
            // InternalC2fDSL.g:330:2: (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm )
            {
            // InternalC2fDSL.g:330:2: (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BRACESOPEN) ) {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    alt3=1;
                    }
                    break;
                case 61:
                    {
                    alt3=3;
                    }
                    break;
                case 59:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalC2fDSL.g:331:3: this_StaticContainer_0= ruleStaticContainer
                    {

                    			newCompositeNode(grammarAccess.getContainerViewAccess().getStaticContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticContainer_0=ruleStaticContainer();

                    state._fsp--;


                    			current = this_StaticContainer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:340:3: this_IterationContainer_1= ruleIterationContainer
                    {

                    			newCompositeNode(grammarAccess.getContainerViewAccess().getIterationContainerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IterationContainer_1=ruleIterationContainer();

                    state._fsp--;


                    			current = this_IterationContainer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalC2fDSL.g:349:3: this_InputForm_2= ruleInputForm
                    {

                    			newCompositeNode(grammarAccess.getContainerViewAccess().getInputFormParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputForm_2=ruleInputForm();

                    state._fsp--;


                    			current = this_InputForm_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerView"


    // $ANTLR start "entryRuleEntityModelElement"
    // InternalC2fDSL.g:361:1: entryRuleEntityModelElement returns [EObject current=null] : iv_ruleEntityModelElement= ruleEntityModelElement EOF ;
    public final EObject entryRuleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModelElement = null;


        try {
            // InternalC2fDSL.g:361:59: (iv_ruleEntityModelElement= ruleEntityModelElement EOF )
            // InternalC2fDSL.g:362:2: iv_ruleEntityModelElement= ruleEntityModelElement EOF
            {
             newCompositeNode(grammarAccess.getEntityModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityModelElement=ruleEntityModelElement();

            state._fsp--;

             current =iv_ruleEntityModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityModelElement"


    // $ANTLR start "ruleEntityModelElement"
    // InternalC2fDSL.g:368:1: ruleEntityModelElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_PrimitiveType_1 = null;

        EObject this_Enumeration_2 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:374:2: ( (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration ) )
            // InternalC2fDSL.g:375:2: (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration )
            {
            // InternalC2fDSL.g:375:2: (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_BRACESOPEN) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt4=1;
                    }
                    break;
                case 38:
                    {
                    alt4=2;
                    }
                    break;
                case 40:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalC2fDSL.g:376:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:385:3: this_PrimitiveType_1= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getEntityModelElementAccess().getPrimitiveTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalC2fDSL.g:394:3: this_Enumeration_2= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityModelElement"


    // $ANTLR start "entryRuleElementView"
    // InternalC2fDSL.g:406:1: entryRuleElementView returns [EObject current=null] : iv_ruleElementView= ruleElementView EOF ;
    public final EObject entryRuleElementView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementView = null;


        try {
            // InternalC2fDSL.g:406:52: (iv_ruleElementView= ruleElementView EOF )
            // InternalC2fDSL.g:407:2: iv_ruleElementView= ruleElementView EOF
            {
             newCompositeNode(grammarAccess.getElementViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementView=ruleElementView();

            state._fsp--;

             current =iv_ruleElementView; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementView"


    // $ANTLR start "ruleElementView"
    // InternalC2fDSL.g:413:1: ruleElementView returns [EObject current=null] : (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup ) ;
    public final EObject ruleElementView() throws RecognitionException {
        EObject current = null;

        EObject this_Autocomplete_0 = null;

        EObject this_Dropdownlist_1 = null;

        EObject this_Image_2 = null;

        EObject this_List_3 = null;

        EObject this_InputText_4 = null;

        EObject this_StaticContainer_5 = null;

        EObject this_TextArea_6 = null;

        EObject this_IterationContainer_7 = null;

        EObject this_InputForm_8 = null;

        EObject this_RadioButtonGroup_9 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:419:2: ( (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup ) )
            // InternalC2fDSL.g:420:2: (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup )
            {
            // InternalC2fDSL.g:420:2: (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalC2fDSL.g:421:3: this_Autocomplete_0= ruleAutocomplete
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getAutocompleteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Autocomplete_0=ruleAutocomplete();

                    state._fsp--;


                    			current = this_Autocomplete_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:430:3: this_Dropdownlist_1= ruleDropdownlist
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getDropdownlistParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dropdownlist_1=ruleDropdownlist();

                    state._fsp--;


                    			current = this_Dropdownlist_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalC2fDSL.g:439:3: this_Image_2= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getImageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_2=ruleImage();

                    state._fsp--;


                    			current = this_Image_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalC2fDSL.g:448:3: this_List_3= ruleList
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getListParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_3=ruleList();

                    state._fsp--;


                    			current = this_List_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalC2fDSL.g:457:3: this_InputText_4= ruleInputText
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getInputTextParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputText_4=ruleInputText();

                    state._fsp--;


                    			current = this_InputText_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalC2fDSL.g:466:3: this_StaticContainer_5= ruleStaticContainer
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getStaticContainerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticContainer_5=ruleStaticContainer();

                    state._fsp--;


                    			current = this_StaticContainer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalC2fDSL.g:475:3: this_TextArea_6= ruleTextArea
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getTextAreaParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextArea_6=ruleTextArea();

                    state._fsp--;


                    			current = this_TextArea_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalC2fDSL.g:484:3: this_IterationContainer_7= ruleIterationContainer
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getIterationContainerParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_IterationContainer_7=ruleIterationContainer();

                    state._fsp--;


                    			current = this_IterationContainer_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalC2fDSL.g:493:3: this_InputForm_8= ruleInputForm
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getInputFormParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputForm_8=ruleInputForm();

                    state._fsp--;


                    			current = this_InputForm_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalC2fDSL.g:502:3: this_RadioButtonGroup_9= ruleRadioButtonGroup
                    {

                    			newCompositeNode(grammarAccess.getElementViewAccess().getRadioButtonGroupParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadioButtonGroup_9=ruleRadioButtonGroup();

                    state._fsp--;


                    			current = this_RadioButtonGroup_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementView"


    // $ANTLR start "entryRuleStructuralFeature"
    // InternalC2fDSL.g:514:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // InternalC2fDSL.g:514:58: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // InternalC2fDSL.g:515:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuralFeature=ruleStructuralFeature();

            state._fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // InternalC2fDSL.g:521:1: ruleStructuralFeature returns [EObject current=null] : (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Composition_0 = null;

        EObject this_Property_1 = null;

        EObject this_Reference_2 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:527:2: ( (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference ) )
            // InternalC2fDSL.g:528:2: (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference )
            {
            // InternalC2fDSL.g:528:2: (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BRACESOPEN) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt6=1;
                    }
                    break;
                case 42:
                    {
                    alt6=3;
                    }
                    break;
                case 33:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalC2fDSL.g:529:3: this_Composition_0= ruleComposition
                    {

                    			newCompositeNode(grammarAccess.getStructuralFeatureAccess().getCompositionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composition_0=ruleComposition();

                    state._fsp--;


                    			current = this_Composition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:538:3: this_Property_1= ruleProperty
                    {

                    			newCompositeNode(grammarAccess.getStructuralFeatureAccess().getPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Property_1=ruleProperty();

                    state._fsp--;


                    			current = this_Property_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalC2fDSL.g:547:3: this_Reference_2= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_2=ruleReference();

                    state._fsp--;


                    			current = this_Reference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleEString"
    // InternalC2fDSL.g:559:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalC2fDSL.g:559:47: (iv_ruleEString= ruleEString EOF )
            // InternalC2fDSL.g:560:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalC2fDSL.g:566:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:572:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalC2fDSL.g:573:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalC2fDSL.g:573:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalC2fDSL.g:574:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:582:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntitiesModel"
    // InternalC2fDSL.g:593:1: entryRuleEntitiesModel returns [EObject current=null] : iv_ruleEntitiesModel= ruleEntitiesModel EOF ;
    public final EObject entryRuleEntitiesModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitiesModel = null;


        try {
            // InternalC2fDSL.g:593:54: (iv_ruleEntitiesModel= ruleEntitiesModel EOF )
            // InternalC2fDSL.g:594:2: iv_ruleEntitiesModel= ruleEntitiesModel EOF
            {
             newCompositeNode(grammarAccess.getEntitiesModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitiesModel=ruleEntitiesModel();

            state._fsp--;

             current =iv_ruleEntitiesModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntitiesModel"


    // $ANTLR start "ruleEntitiesModel"
    // InternalC2fDSL.g:600:1: ruleEntitiesModel returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE ) ;
    public final EObject ruleEntitiesModel() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_BRACKETSO_8=null;
        Token this_COMMA_10=null;
        Token this_BRACKETSC_12=null;
        Token this_BRACESCLOSE_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_modelElements_9_0 = null;

        EObject lv_modelElements_11_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:606:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:607:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:607:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:608:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:608:3: ()
            // InternalC2fDSL.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntitiesModelAccess().getEntitiesModelAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getEntitiesModelAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntitiesModelAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getEntitiesModelAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:627:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:628:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:628:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:629:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntitiesModelAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitiesModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_5, grammarAccess.getEntitiesModelAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEntitiesModelAccess().getElementsKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_7, grammarAccess.getEntitiesModelAccess().getCOLONTerminalRuleCall_7());
            		
            this_BRACKETSO_8=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_8, grammarAccess.getEntitiesModelAccess().getBRACKETSOTerminalRuleCall_8());
            		
            // InternalC2fDSL.g:662:3: ( (lv_modelElements_9_0= ruleEntityModelElement ) )
            // InternalC2fDSL.g:663:4: (lv_modelElements_9_0= ruleEntityModelElement )
            {
            // InternalC2fDSL.g:663:4: (lv_modelElements_9_0= ruleEntityModelElement )
            // InternalC2fDSL.g:664:5: lv_modelElements_9_0= ruleEntityModelElement
            {

            					newCompositeNode(grammarAccess.getEntitiesModelAccess().getModelElementsEntityModelElementParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_modelElements_9_0=ruleEntityModelElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitiesModelRule());
            					}
            					add(
            						current,
            						"modelElements",
            						lv_modelElements_9_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EntityModelElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:681:3: (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalC2fDSL.g:682:4: this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) )
            	    {
            	    this_COMMA_10=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_10, grammarAccess.getEntitiesModelAccess().getCOMMATerminalRuleCall_10_0());
            	    			
            	    // InternalC2fDSL.g:686:4: ( (lv_modelElements_11_0= ruleEntityModelElement ) )
            	    // InternalC2fDSL.g:687:5: (lv_modelElements_11_0= ruleEntityModelElement )
            	    {
            	    // InternalC2fDSL.g:687:5: (lv_modelElements_11_0= ruleEntityModelElement )
            	    // InternalC2fDSL.g:688:6: lv_modelElements_11_0= ruleEntityModelElement
            	    {

            	    						newCompositeNode(grammarAccess.getEntitiesModelAccess().getModelElementsEntityModelElementParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_modelElements_11_0=ruleEntityModelElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntitiesModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modelElements",
            	    							lv_modelElements_11_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.EntityModelElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_BRACKETSC_12=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

            			newLeafNode(this_BRACKETSC_12, grammarAccess.getEntitiesModelAccess().getBRACKETSCTerminalRuleCall_11());
            		
            this_BRACESCLOSE_13=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_13, grammarAccess.getEntitiesModelAccess().getBRACESCLOSETerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntitiesModel"


    // $ANTLR start "entryRuleSiteView"
    // InternalC2fDSL.g:718:1: entryRuleSiteView returns [EObject current=null] : iv_ruleSiteView= ruleSiteView EOF ;
    public final EObject entryRuleSiteView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteView = null;


        try {
            // InternalC2fDSL.g:718:49: (iv_ruleSiteView= ruleSiteView EOF )
            // InternalC2fDSL.g:719:2: iv_ruleSiteView= ruleSiteView EOF
            {
             newCompositeNode(grammarAccess.getSiteViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteView=ruleSiteView();

            state._fsp--;

             current =iv_ruleSiteView; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteView"


    // $ANTLR start "ruleSiteView"
    // InternalC2fDSL.g:725:1: ruleSiteView returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE ) ;
    public final EObject ruleSiteView() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token this_BRACESCLOSE_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_templateColor_8_0 = null;

        AntlrDatatypeRuleToken lv_displayName_12_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:731:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:732:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:732:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:733:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:733:3: ()
            // InternalC2fDSL.g:734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSiteViewAccess().getSiteViewAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getSiteViewAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSiteViewAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getSiteViewAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:752:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:753:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:753:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:754:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSiteViewAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSiteViewRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_16); 

            			newLeafNode(this_COMMA_5, grammarAccess.getSiteViewAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:775:3: (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalC2fDSL.g:776:4: otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSiteViewAccess().getTemplateColorKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getSiteViewAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:784:4: ( (lv_templateColor_8_0= ruleEString ) )
                    // InternalC2fDSL.g:785:5: (lv_templateColor_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:785:5: (lv_templateColor_8_0= ruleEString )
                    // InternalC2fDSL.g:786:6: lv_templateColor_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSiteViewAccess().getTemplateColorEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_templateColor_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSiteViewRule());
                    						}
                    						set(
                    							current,
                    							"templateColor",
                    							lv_templateColor_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_17); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getSiteViewAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSiteViewAccess().getDisplayNameKeyword_7());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_11, grammarAccess.getSiteViewAccess().getCOLONTerminalRuleCall_8());
            		
            // InternalC2fDSL.g:816:3: ( (lv_displayName_12_0= ruleEString ) )
            // InternalC2fDSL.g:817:4: (lv_displayName_12_0= ruleEString )
            {
            // InternalC2fDSL.g:817:4: (lv_displayName_12_0= ruleEString )
            // InternalC2fDSL.g:818:5: lv_displayName_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSiteViewAccess().getDisplayNameEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_displayName_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSiteViewRule());
            					}
            					set(
            						current,
            						"displayName",
            						lv_displayName_12_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_14); 

            			newLeafNode(this_COMMA_13, grammarAccess.getSiteViewAccess().getCOMMATerminalRuleCall_10());
            		
            this_BRACESCLOSE_14=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_14, grammarAccess.getSiteViewAccess().getBRACESCLOSETerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteView"


    // $ANTLR start "entryRulePageView"
    // InternalC2fDSL.g:847:1: entryRulePageView returns [EObject current=null] : iv_rulePageView= rulePageView EOF ;
    public final EObject entryRulePageView() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageView = null;


        try {
            // InternalC2fDSL.g:847:49: (iv_rulePageView= rulePageView EOF )
            // InternalC2fDSL.g:848:2: iv_rulePageView= rulePageView EOF
            {
             newCompositeNode(grammarAccess.getPageViewRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageView=rulePageView();

            state._fsp--;

             current =iv_rulePageView; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageView"


    // $ANTLR start "rulePageView"
    // InternalC2fDSL.g:854:1: rulePageView returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE ) ;
    public final EObject rulePageView() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_BRACKETSO_12=null;
        Token this_COMMA_14=null;
        Token this_BRACKETSC_16=null;
        Token this_BRACESCLOSE_17=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_layoutType_8_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:860:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:861:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:861:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:862:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:862:3: ()
            // InternalC2fDSL.g:863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPageViewAccess().getPageViewAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getPageViewAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPageViewAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getPageViewAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:881:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:882:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:882:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:883:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageViewAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageViewRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_18); 

            			newLeafNode(this_COMMA_5, grammarAccess.getPageViewAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPageViewAccess().getLayoutTypeKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_19); 

            			newLeafNode(this_COLON_7, grammarAccess.getPageViewAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalC2fDSL.g:912:3: ( (lv_layoutType_8_0= ruleLayoutType ) )
            // InternalC2fDSL.g:913:4: (lv_layoutType_8_0= ruleLayoutType )
            {
            // InternalC2fDSL.g:913:4: (lv_layoutType_8_0= ruleLayoutType )
            // InternalC2fDSL.g:914:5: lv_layoutType_8_0= ruleLayoutType
            {

            					newCompositeNode(grammarAccess.getPageViewAccess().getLayoutTypeLayoutTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_layoutType_8_0=ruleLayoutType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageViewRule());
            					}
            					set(
            						current,
            						"layoutType",
            						lv_layoutType_8_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.LayoutType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_20); 

            			newLeafNode(this_COMMA_9, grammarAccess.getPageViewAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPageViewAccess().getElementViewsKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getPageViewAccess().getCOLONTerminalRuleCall_11());
            		
            this_BRACKETSO_12=(Token)match(input,RULE_BRACKETSO,FOLLOW_5); 

            			newLeafNode(this_BRACKETSO_12, grammarAccess.getPageViewAccess().getBRACKETSOTerminalRuleCall_12());
            		
            // InternalC2fDSL.g:947:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:948:4: ( ruleEString )
            {
            // InternalC2fDSL.g:948:4: ( ruleEString )
            // InternalC2fDSL.g:949:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageViewRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPageViewAccess().getElementViewsElementViewCrossReference_13_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:963:3: (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalC2fDSL.g:964:4: this_COMMA_14= RULE_COMMA ( ( ruleEString ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_5); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getPageViewAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalC2fDSL.g:968:4: ( ( ruleEString ) )
            	    // InternalC2fDSL.g:969:5: ( ruleEString )
            	    {
            	    // InternalC2fDSL.g:969:5: ( ruleEString )
            	    // InternalC2fDSL.g:970:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPageViewRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPageViewAccess().getElementViewsElementViewCrossReference_14_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_BRACKETSC_16=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

            			newLeafNode(this_BRACKETSC_16, grammarAccess.getPageViewAccess().getBRACKETSCTerminalRuleCall_15());
            		
            this_BRACESCLOSE_17=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_17, grammarAccess.getPageViewAccess().getBRACESCLOSETerminalRuleCall_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageView"


    // $ANTLR start "entryRuleComposition"
    // InternalC2fDSL.g:997:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalC2fDSL.g:997:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalC2fDSL.g:998:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalC2fDSL.g:1004:1: ruleComposition returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) )? (otherlv_16= 'displayName' this_COLON_17= RULE_COLON ( (lv_displayName_18_0= ruleEString ) ) )? otherlv_19= 'target' this_COLON_20= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_0=null;
        Token otherlv_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_COLON_6=null;
        Token this_COMMA_8=null;
        Token otherlv_9=null;
        Token this_COLON_10=null;
        Token this_COMMA_12=null;
        Token otherlv_13=null;
        Token this_COLON_14=null;
        Token otherlv_16=null;
        Token this_COLON_17=null;
        Token otherlv_19=null;
        Token this_COLON_20=null;
        Token this_BRACESCLOSE_22=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_required_7_0 = null;

        AntlrDatatypeRuleToken lv_many_11_0 = null;

        AntlrDatatypeRuleToken lv_description_15_0 = null;

        AntlrDatatypeRuleToken lv_displayName_18_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1010:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) )? (otherlv_16= 'displayName' this_COLON_17= RULE_COLON ( (lv_displayName_18_0= ruleEString ) ) )? otherlv_19= 'target' this_COLON_20= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1011:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) )? (otherlv_16= 'displayName' this_COLON_17= RULE_COLON ( (lv_displayName_18_0= ruleEString ) ) )? otherlv_19= 'target' this_COLON_20= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1011:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) )? (otherlv_16= 'displayName' this_COLON_17= RULE_COLON ( (lv_displayName_18_0= ruleEString ) ) )? otherlv_19= 'target' this_COLON_20= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1012:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) )? (otherlv_16= 'displayName' this_COLON_17= RULE_COLON ( (lv_displayName_18_0= ruleEString ) ) )? otherlv_19= 'target' this_COLON_20= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_21); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getCompositionAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getCompositionKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1024:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1025:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1025:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1026:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_22); 

            			newLeafNode(this_COMMA_4, grammarAccess.getCompositionAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalC2fDSL.g:1047:3: (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalC2fDSL.g:1048:4: otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getRequiredKeyword_5_0());
                    			
                    this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_23); 

                    				newLeafNode(this_COLON_6, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_5_1());
                    			
                    // InternalC2fDSL.g:1056:4: ( (lv_required_7_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:1057:5: (lv_required_7_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:1057:5: (lv_required_7_0= ruleEBoolean )
                    // InternalC2fDSL.g:1058:6: lv_required_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getRequiredEBooleanParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_required_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_24); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getCompositionAccess().getCOMMATerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1080:3: (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalC2fDSL.g:1081:4: otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositionAccess().getManyKeyword_6_0());
                    			
                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_23); 

                    				newLeafNode(this_COLON_10, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1089:4: ( (lv_many_11_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:1090:5: (lv_many_11_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:1090:5: (lv_many_11_0= ruleEBoolean )
                    // InternalC2fDSL.g:1091:6: lv_many_11_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getManyEBooleanParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_many_11_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"many",
                    							lv_many_11_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_25); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getCompositionAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1113:3: (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalC2fDSL.g:1114:4: otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_14, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:1122:4: ( (lv_description_15_0= ruleEString ) )
                    // InternalC2fDSL.g:1123:5: (lv_description_15_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1123:5: (lv_description_15_0= ruleEString )
                    // InternalC2fDSL.g:1124:6: lv_description_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_description_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_15_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:1142:3: (otherlv_16= 'displayName' this_COLON_17= RULE_COLON ( (lv_displayName_18_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalC2fDSL.g:1143:4: otherlv_16= 'displayName' this_COLON_17= RULE_COLON ( (lv_displayName_18_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositionAccess().getDisplayNameKeyword_8_0());
                    			
                    this_COLON_17=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_17, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:1151:4: ( (lv_displayName_18_0= ruleEString ) )
                    // InternalC2fDSL.g:1152:5: (lv_displayName_18_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1152:5: (lv_displayName_18_0= ruleEString )
                    // InternalC2fDSL.g:1153:6: lv_displayName_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getDisplayNameEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_displayName_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_18_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getCompositionAccess().getTargetKeyword_9());
            		
            this_COLON_20=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_20, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalC2fDSL.g:1179:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:1180:4: ( ruleEString )
            {
            // InternalC2fDSL.g:1180:4: ( ruleEString )
            // InternalC2fDSL.g:1181:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositionAccess().getTargetEntityCrossReference_11_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_22=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_22, grammarAccess.getCompositionAccess().getBRACESCLOSETerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleProperty"
    // InternalC2fDSL.g:1203:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalC2fDSL.g:1203:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalC2fDSL.g:1204:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalC2fDSL.g:1210:1: ruleProperty returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'dataType' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_0=null;
        Token otherlv_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_COLON_6=null;
        Token this_COMMA_8=null;
        Token otherlv_9=null;
        Token this_COLON_10=null;
        Token this_COMMA_12=null;
        Token otherlv_13=null;
        Token this_COLON_14=null;
        Token this_COMMA_16=null;
        Token otherlv_17=null;
        Token this_COLON_18=null;
        Token this_COMMA_20=null;
        Token otherlv_21=null;
        Token this_COLON_22=null;
        Token this_BRACESCLOSE_24=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_displayName_11_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_15_0 = null;

        AntlrDatatypeRuleToken lv_required_19_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1216:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'dataType' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1217:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'dataType' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1217:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'dataType' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1218:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'dataType' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_28); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getPropertyAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1230:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1231:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1231:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1232:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_29); 

            			newLeafNode(this_COMMA_4, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalC2fDSL.g:1253:3: (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalC2fDSL.g:1254:4: otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDescriptionKeyword_5_0());
                    			
                    this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_6, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_5_1());
                    			
                    // InternalC2fDSL.g:1262:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalC2fDSL.g:1263:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1263:5: (lv_description_7_0= ruleEString )
                    // InternalC2fDSL.g:1264:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_30); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1286:3: (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalC2fDSL.g:1287:4: otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_10, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1295:4: ( (lv_displayName_11_0= ruleEString ) )
                    // InternalC2fDSL.g:1296:5: (lv_displayName_11_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1296:5: (lv_displayName_11_0= ruleEString )
                    // InternalC2fDSL.g:1297:6: lv_displayName_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getDisplayNameEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_11_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_31); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1319:3: (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalC2fDSL.g:1320:4: otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getPropertyAccess().getDefaultValueKeyword_7_0());
                    			
                    this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_14, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:1328:4: ( (lv_defaultValue_15_0= ruleEString ) )
                    // InternalC2fDSL.g:1329:5: (lv_defaultValue_15_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1329:5: (lv_defaultValue_15_0= ruleEString )
                    // InternalC2fDSL.g:1330:6: lv_defaultValue_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getDefaultValueEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_defaultValue_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_15_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_32); 

                    				newLeafNode(this_COMMA_16, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1352:3: (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) this_COMMA_20= RULE_COMMA )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalC2fDSL.g:1353:4: otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) this_COMMA_20= RULE_COMMA
                    {
                    otherlv_17=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getPropertyAccess().getRequiredKeyword_8_0());
                    			
                    this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_23); 

                    				newLeafNode(this_COLON_18, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:1361:4: ( (lv_required_19_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:1362:5: (lv_required_19_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:1362:5: (lv_required_19_0= ruleEBoolean )
                    // InternalC2fDSL.g:1363:6: lv_required_19_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getRequiredEBooleanParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_required_19_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_19_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_20=(Token)match(input,RULE_COMMA,FOLLOW_33); 

                    				newLeafNode(this_COMMA_20, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_21, grammarAccess.getPropertyAccess().getDataTypeKeyword_9());
            		
            this_COLON_22=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_22, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalC2fDSL.g:1393:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:1394:4: ( ruleEString )
            {
            // InternalC2fDSL.g:1394:4: ( ruleEString )
            // InternalC2fDSL.g:1395:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypePropertyTypeCrossReference_11_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_24=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_24, grammarAccess.getPropertyAccess().getBRACESCLOSETerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEntity"
    // InternalC2fDSL.g:1417:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalC2fDSL.g:1417:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalC2fDSL.g:1418:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalC2fDSL.g:1424:1: ruleEntity returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COMMA_16=null;
        Token otherlv_17=null;
        Token this_COLON_18=null;
        Token this_BRACKETSO_19=null;
        Token this_COMMA_21=null;
        Token this_BRACKETSC_23=null;
        Token this_BRACESCLOSE_24=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_displayName_12_0 = null;

        EObject lv_structuralFeatures_20_0 = null;

        EObject lv_structuralFeatures_22_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1430:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1431:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1431:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1432:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:1432:3: ()
            // InternalC2fDSL.g:1433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_34); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getEntityAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getClassKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getEntityAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:1451:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:1452:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:1452:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:1453:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_35); 

            			newLeafNode(this_COMMA_5, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:1474:3: (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalC2fDSL.g:1475:4: otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getDescriptionKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getEntityAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1483:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalC2fDSL.g:1484:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1484:5: (lv_description_8_0= ruleEString )
                    // InternalC2fDSL.g:1485:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getDescriptionEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_36); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1507:3: (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalC2fDSL.g:1508:4: otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getDisplayNameKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getEntityAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:1516:4: ( (lv_displayName_12_0= ruleEString ) )
                    // InternalC2fDSL.g:1517:5: (lv_displayName_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1517:5: (lv_displayName_12_0= ruleEString )
                    // InternalC2fDSL.g:1518:6: lv_displayName_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getDisplayNameEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_37); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1540:3: (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalC2fDSL.g:1541:4: otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getSuperclassKeyword_8_0());
                    			
                    // InternalC2fDSL.g:1545:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:1546:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:1546:5: ( ruleEString )
                    // InternalC2fDSL.g:1547:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSuperclassEntityCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_15); 

                    				newLeafNode(this_COMMA_16, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_8_2());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getEntityAccess().getElementsKeyword_9());
            		
            this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_18, grammarAccess.getEntityAccess().getCOLONTerminalRuleCall_10());
            		
            this_BRACKETSO_19=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_19, grammarAccess.getEntityAccess().getBRACKETSOTerminalRuleCall_11());
            		
            // InternalC2fDSL.g:1578:3: ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) )
            // InternalC2fDSL.g:1579:4: (lv_structuralFeatures_20_0= ruleStructuralFeature )
            {
            // InternalC2fDSL.g:1579:4: (lv_structuralFeatures_20_0= ruleStructuralFeature )
            // InternalC2fDSL.g:1580:5: lv_structuralFeatures_20_0= ruleStructuralFeature
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getStructuralFeaturesStructuralFeatureParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_structuralFeatures_20_0=ruleStructuralFeature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					add(
            						current,
            						"structuralFeatures",
            						lv_structuralFeatures_20_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.StructuralFeature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:1597:3: (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalC2fDSL.g:1598:4: this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) )
            	    {
            	    this_COMMA_21=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_21, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_13_0());
            	    			
            	    // InternalC2fDSL.g:1602:4: ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) )
            	    // InternalC2fDSL.g:1603:5: (lv_structuralFeatures_22_0= ruleStructuralFeature )
            	    {
            	    // InternalC2fDSL.g:1603:5: (lv_structuralFeatures_22_0= ruleStructuralFeature )
            	    // InternalC2fDSL.g:1604:6: lv_structuralFeatures_22_0= ruleStructuralFeature
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getStructuralFeaturesStructuralFeatureParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_structuralFeatures_22_0=ruleStructuralFeature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"structuralFeatures",
            	    							lv_structuralFeatures_22_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.StructuralFeature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            this_BRACKETSC_23=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

            			newLeafNode(this_BRACKETSC_23, grammarAccess.getEntityAccess().getBRACKETSCTerminalRuleCall_14());
            		
            this_BRACESCLOSE_24=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_24, grammarAccess.getEntityAccess().getBRACESCLOSETerminalRuleCall_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalC2fDSL.g:1634:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalC2fDSL.g:1634:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalC2fDSL.g:1635:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalC2fDSL.g:1641:1: rulePrimitiveType returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_BRACESCLOSE_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1647:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1648:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1648:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1649:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:1649:3: ()
            // InternalC2fDSL.g:1650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_38); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getPrimitiveTypeAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getPrimitiveKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getPrimitiveTypeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:1668:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:1669:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:1669:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:1670:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_5=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_5, grammarAccess.getPrimitiveTypeAccess().getBRACESCLOSETerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleLiteral"
    // InternalC2fDSL.g:1695:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalC2fDSL.g:1695:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalC2fDSL.g:1696:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalC2fDSL.g:1702:1: ruleLiteral returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_0=null;
        Token otherlv_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_BRACESCLOSE_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1708:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1709:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1709:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1710:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getLiteralAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getNameKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getLiteralAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1722:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1723:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1723:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1724:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLiteralAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_39); 

            			newLeafNode(this_COMMA_4, grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,39,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getLiteralAccess().getValueKeyword_5());
            		
            // InternalC2fDSL.g:1749:3: ( (lv_value_6_0= ruleEInt ) )
            // InternalC2fDSL.g:1750:4: (lv_value_6_0= ruleEInt )
            {
            // InternalC2fDSL.g:1750:4: (lv_value_6_0= ruleEInt )
            // InternalC2fDSL.g:1751:5: lv_value_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getLiteralAccess().getValueEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_7=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_7, grammarAccess.getLiteralAccess().getBRACESCLOSETerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEnumeration"
    // InternalC2fDSL.g:1776:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalC2fDSL.g:1776:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalC2fDSL.g:1777:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalC2fDSL.g:1783:1: ruleEnumeration returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_BRACKETSO_15=null;
        Token this_COMMA_17=null;
        Token this_BRACKETSC_19=null;
        Token this_BRACESCLOSE_20=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_displayName_12_0 = null;

        EObject lv_literals_16_0 = null;

        EObject lv_literals_18_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1789:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1790:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1790:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1791:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:1791:3: ()
            // InternalC2fDSL.g:1792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_41); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getEnumerationAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getEnumKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getEnumerationAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:1810:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:1811:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:1811:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:1812:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_42); 

            			newLeafNode(this_COMMA_5, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:1833:3: (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalC2fDSL.g:1834:4: otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getDescriptionKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getEnumerationAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1842:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalC2fDSL.g:1843:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1843:5: (lv_description_8_0= ruleEString )
                    // InternalC2fDSL.g:1844:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnumerationAccess().getDescriptionEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_43); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1866:3: (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalC2fDSL.g:1867:4: otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnumerationAccess().getDisplayNameKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getEnumerationAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:1875:4: ( (lv_displayName_12_0= ruleEString ) )
                    // InternalC2fDSL.g:1876:5: (lv_displayName_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1876:5: (lv_displayName_12_0= ruleEString )
                    // InternalC2fDSL.g:1877:6: lv_displayName_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnumerationAccess().getDisplayNameEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_44); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getEnumerationAccess().getLiteralsKeyword_8());
            		
            this_BRACKETSO_15=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_15, grammarAccess.getEnumerationAccess().getBRACKETSOTerminalRuleCall_9());
            		
            // InternalC2fDSL.g:1907:3: ( (lv_literals_16_0= ruleLiteral ) )
            // InternalC2fDSL.g:1908:4: (lv_literals_16_0= ruleLiteral )
            {
            // InternalC2fDSL.g:1908:4: (lv_literals_16_0= ruleLiteral )
            // InternalC2fDSL.g:1909:5: lv_literals_16_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_literals_16_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"literals",
            						lv_literals_16_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:1926:3: (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalC2fDSL.g:1927:4: this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) )
            	    {
            	    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_17, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_11_0());
            	    			
            	    // InternalC2fDSL.g:1931:4: ( (lv_literals_18_0= ruleLiteral ) )
            	    // InternalC2fDSL.g:1932:5: (lv_literals_18_0= ruleLiteral )
            	    {
            	    // InternalC2fDSL.g:1932:5: (lv_literals_18_0= ruleLiteral )
            	    // InternalC2fDSL.g:1933:6: lv_literals_18_0= ruleLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_literals_18_0=ruleLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literals",
            	    							lv_literals_18_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.Literal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            this_BRACKETSC_19=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

            			newLeafNode(this_BRACKETSC_19, grammarAccess.getEnumerationAccess().getBRACKETSCTerminalRuleCall_12());
            		
            this_BRACESCLOSE_20=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_20, grammarAccess.getEnumerationAccess().getBRACESCLOSETerminalRuleCall_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleReference"
    // InternalC2fDSL.g:1963:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalC2fDSL.g:1963:50: (iv_ruleReference= ruleReference EOF )
            // InternalC2fDSL.g:1964:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalC2fDSL.g:1970:1: ruleReference returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_0=null;
        Token otherlv_1=null;
        Token this_COLON_2=null;
        Token this_COMMA_4=null;
        Token otherlv_5=null;
        Token this_COLON_6=null;
        Token this_COMMA_8=null;
        Token otherlv_9=null;
        Token this_COLON_10=null;
        Token this_COMMA_12=null;
        Token otherlv_13=null;
        Token this_COLON_14=null;
        Token this_COMMA_16=null;
        Token otherlv_17=null;
        Token this_COLON_18=null;
        Token this_COMMA_20=null;
        Token otherlv_21=null;
        Token this_COLON_22=null;
        Token this_BRACESCLOSE_24=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_required_7_0 = null;

        AntlrDatatypeRuleToken lv_many_11_0 = null;

        AntlrDatatypeRuleToken lv_description_15_0 = null;

        AntlrDatatypeRuleToken lv_displayName_19_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1976:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1977:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1977:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1978:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_45); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getReferenceAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getReferenceKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1990:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1991:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1991:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1992:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_22); 

            			newLeafNode(this_COMMA_4, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalC2fDSL.g:2013:3: (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalC2fDSL.g:2014:4: otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getRequiredKeyword_5_0());
                    			
                    this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_23); 

                    				newLeafNode(this_COLON_6, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_5_1());
                    			
                    // InternalC2fDSL.g:2022:4: ( (lv_required_7_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:2023:5: (lv_required_7_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:2023:5: (lv_required_7_0= ruleEBoolean )
                    // InternalC2fDSL.g:2024:6: lv_required_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRequiredEBooleanParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_required_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_24); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2046:3: (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalC2fDSL.g:2047:4: otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getManyKeyword_6_0());
                    			
                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_23); 

                    				newLeafNode(this_COLON_10, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:2055:4: ( (lv_many_11_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:2056:5: (lv_many_11_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:2056:5: (lv_many_11_0= ruleEBoolean )
                    // InternalC2fDSL.g:2057:6: lv_many_11_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getManyEBooleanParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_many_11_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"many",
                    							lv_many_11_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_25); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2079:3: (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalC2fDSL.g:2080:4: otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getReferenceAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_14, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:2088:4: ( (lv_description_15_0= ruleEString ) )
                    // InternalC2fDSL.g:2089:5: (lv_description_15_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2089:5: (lv_description_15_0= ruleEString )
                    // InternalC2fDSL.g:2090:6: lv_description_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_15_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_26); 

                    				newLeafNode(this_COMMA_16, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2112:3: (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalC2fDSL.g:2113:4: otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA
                    {
                    otherlv_17=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getReferenceAccess().getDisplayNameKeyword_8_0());
                    			
                    this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_18, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:2121:4: ( (lv_displayName_19_0= ruleEString ) )
                    // InternalC2fDSL.g:2122:5: (lv_displayName_19_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2122:5: (lv_displayName_19_0= ruleEString )
                    // InternalC2fDSL.g:2123:6: lv_displayName_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getDisplayNameEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_19_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_20=(Token)match(input,RULE_COMMA,FOLLOW_27); 

                    				newLeafNode(this_COMMA_20, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_21, grammarAccess.getReferenceAccess().getTargetKeyword_9());
            		
            this_COLON_22=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_22, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalC2fDSL.g:2153:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:2154:4: ( ruleEString )
            {
            // InternalC2fDSL.g:2154:4: ( ruleEString )
            // InternalC2fDSL.g:2155:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetEntityCrossReference_11_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_24=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_24, grammarAccess.getReferenceAccess().getBRACESCLOSETerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEBoolean"
    // InternalC2fDSL.g:2177:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalC2fDSL.g:2177:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalC2fDSL.g:2178:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalC2fDSL.g:2184:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:2190:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalC2fDSL.g:2191:2: (kw= 'true' | kw= 'false' )
            {
            // InternalC2fDSL.g:2191:2: (kw= 'true' | kw= 'false' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            else if ( (LA30_0==44) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalC2fDSL.g:2192:3: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:2198:3: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalC2fDSL.g:2207:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalC2fDSL.g:2207:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalC2fDSL.g:2208:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalC2fDSL.g:2214:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:2220:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalC2fDSL.g:2221:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalC2fDSL.g:2221:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalC2fDSL.g:2222:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalC2fDSL.g:2222:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalC2fDSL.g:2223:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_46); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAutocomplete"
    // InternalC2fDSL.g:2240:1: entryRuleAutocomplete returns [EObject current=null] : iv_ruleAutocomplete= ruleAutocomplete EOF ;
    public final EObject entryRuleAutocomplete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutocomplete = null;


        try {
            // InternalC2fDSL.g:2240:53: (iv_ruleAutocomplete= ruleAutocomplete EOF )
            // InternalC2fDSL.g:2241:2: iv_ruleAutocomplete= ruleAutocomplete EOF
            {
             newCompositeNode(grammarAccess.getAutocompleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutocomplete=ruleAutocomplete();

            state._fsp--;

             current =iv_ruleAutocomplete; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutocomplete"


    // $ANTLR start "ruleAutocomplete"
    // InternalC2fDSL.g:2247:1: ruleAutocomplete returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE ) ;
    public final EObject ruleAutocomplete() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COMMA_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token this_BRACESCLOSE_19=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_multiple_8_0 = null;

        AntlrDatatypeRuleToken lv_displayName_11_0 = null;

        AntlrDatatypeRuleToken lv_description_14_0 = null;

        AntlrDatatypeRuleToken lv_label_16_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2253:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2254:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2254:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2255:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2255:3: ()
            // InternalC2fDSL.g:2256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutocompleteAccess().getAutocompleteAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getAutocompleteAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAutocompleteAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getAutocompleteAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:2274:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:2275:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:2275:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:2276:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutocompleteAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutocompleteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_47); 

            			newLeafNode(this_COMMA_5, grammarAccess.getAutocompleteAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getAutocompleteAccess().getMultipleKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_23); 

            			newLeafNode(this_COLON_7, grammarAccess.getAutocompleteAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalC2fDSL.g:2305:3: ( (lv_multiple_8_0= ruleEBoolean ) )
            // InternalC2fDSL.g:2306:4: (lv_multiple_8_0= ruleEBoolean )
            {
            // InternalC2fDSL.g:2306:4: (lv_multiple_8_0= ruleEBoolean )
            // InternalC2fDSL.g:2307:5: lv_multiple_8_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getAutocompleteAccess().getMultipleEBooleanParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_multiple_8_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutocompleteRule());
            					}
            					set(
            						current,
            						"multiple",
            						lv_multiple_8_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_48); 

            			newLeafNode(this_COMMA_9, grammarAccess.getAutocompleteAccess().getCOMMATerminalRuleCall_9());
            		
            // InternalC2fDSL.g:2328:3: (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalC2fDSL.g:2329:4: otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getAutocompleteAccess().getDisplayNameKeyword_10_0());
                    			
                    // InternalC2fDSL.g:2333:4: ( (lv_displayName_11_0= ruleEString ) )
                    // InternalC2fDSL.g:2334:5: (lv_displayName_11_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2334:5: (lv_displayName_11_0= ruleEString )
                    // InternalC2fDSL.g:2335:6: lv_displayName_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutocompleteAccess().getDisplayNameEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutocompleteRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_11_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_49); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getAutocompleteAccess().getCOMMATerminalRuleCall_10_2());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2357:3: (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalC2fDSL.g:2358:4: otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getAutocompleteAccess().getDescriptionKeyword_11_0());
                    			
                    // InternalC2fDSL.g:2362:4: ( (lv_description_14_0= ruleEString ) )
                    // InternalC2fDSL.g:2363:5: (lv_description_14_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2363:5: (lv_description_14_0= ruleEString )
                    // InternalC2fDSL.g:2364:6: lv_description_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutocompleteAccess().getDescriptionEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_description_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutocompleteRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_14_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2382:3: (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalC2fDSL.g:2383:4: otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getAutocompleteAccess().getLabelKeyword_12_0());
                    			
                    // InternalC2fDSL.g:2387:4: ( (lv_label_16_0= ruleEString ) )
                    // InternalC2fDSL.g:2388:5: (lv_label_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2388:5: (lv_label_16_0= ruleEString )
                    // InternalC2fDSL.g:2389:6: lv_label_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutocompleteAccess().getLabelEStringParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_label_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutocompleteRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2407:3: (otherlv_17= 'property' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalC2fDSL.g:2408:4: otherlv_17= 'property' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getAutocompleteAccess().getPropertyKeyword_13_0());
                    			
                    // InternalC2fDSL.g:2412:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:2413:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:2413:5: ( ruleEString )
                    // InternalC2fDSL.g:2414:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutocompleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAutocompleteAccess().getPropertyStructuralFeatureCrossReference_13_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_19=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_19, grammarAccess.getAutocompleteAccess().getBRACESCLOSETerminalRuleCall_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutocomplete"


    // $ANTLR start "entryRuleDropdownlist"
    // InternalC2fDSL.g:2437:1: entryRuleDropdownlist returns [EObject current=null] : iv_ruleDropdownlist= ruleDropdownlist EOF ;
    public final EObject entryRuleDropdownlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropdownlist = null;


        try {
            // InternalC2fDSL.g:2437:53: (iv_ruleDropdownlist= ruleDropdownlist EOF )
            // InternalC2fDSL.g:2438:2: iv_ruleDropdownlist= ruleDropdownlist EOF
            {
             newCompositeNode(grammarAccess.getDropdownlistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropdownlist=ruleDropdownlist();

            state._fsp--;

             current =iv_ruleDropdownlist; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropdownlist"


    // $ANTLR start "ruleDropdownlist"
    // InternalC2fDSL.g:2444:1: ruleDropdownlist returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'dropDownList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_21= RULE_BRACESCLOSE ) ;
    public final EObject ruleDropdownlist() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_BRACESCLOSE_21=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_label_16_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2450:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'dropDownList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_21= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2451:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'dropDownList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_21= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2451:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'dropDownList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_21= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2452:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'dropDownList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_21= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2452:3: ()
            // InternalC2fDSL.g:2453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropdownlistAccess().getDropdownlistAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_52); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getDropdownlistAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDropdownlistAccess().getDropDownListKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getDropdownlistAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:2471:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:2472:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:2472:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:2473:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDropdownlistAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropdownlistRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_48); 

            			newLeafNode(this_COMMA_5, grammarAccess.getDropdownlistAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:2494:3: (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalC2fDSL.g:2495:4: otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getDropdownlistAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getDropdownlistAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:2503:4: ( (lv_displayName_8_0= ruleEString ) )
                    // InternalC2fDSL.g:2504:5: (lv_displayName_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2504:5: (lv_displayName_8_0= ruleEString )
                    // InternalC2fDSL.g:2505:6: lv_displayName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getDisplayNameEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropdownlistRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_49); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getDropdownlistAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2527:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalC2fDSL.g:2528:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getDropdownlistAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getDropdownlistAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:2536:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:2537:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2537:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:2538:6: lv_description_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropdownlistRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_50); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getDropdownlistAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2560:3: (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalC2fDSL.g:2561:4: otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getDropdownlistAccess().getLabelKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getDropdownlistAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:2569:4: ( (lv_label_16_0= ruleEString ) )
                    // InternalC2fDSL.g:2570:5: (lv_label_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2570:5: (lv_label_16_0= ruleEString )
                    // InternalC2fDSL.g:2571:6: lv_label_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getLabelEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_label_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropdownlistRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_51); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getDropdownlistAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2593:3: (otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalC2fDSL.g:2594:4: otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getDropdownlistAccess().getPropertyKeyword_9_0());
                    			
                    this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_19, grammarAccess.getDropdownlistAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    // InternalC2fDSL.g:2602:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:2603:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:2603:5: ( ruleEString )
                    // InternalC2fDSL.g:2604:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDropdownlistRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getPropertyStructuralFeatureCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_21=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_21, grammarAccess.getDropdownlistAccess().getBRACESCLOSETerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropdownlist"


    // $ANTLR start "entryRuleImage"
    // InternalC2fDSL.g:2627:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalC2fDSL.g:2627:46: (iv_ruleImage= ruleImage EOF )
            // InternalC2fDSL.g:2628:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalC2fDSL.g:2634:1: ruleImage returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'width' this_COLON_15= RULE_COLON ( (lv_width_16_0= ruleEDouble ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'height' this_COLON_19= RULE_COLON ( (lv_height_20_0= ruleEDouble ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_COMMA_21=null;
        Token otherlv_22=null;
        Token this_COLON_23=null;
        Token this_BRACESCLOSE_25=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_width_16_0 = null;

        AntlrDatatypeRuleToken lv_height_20_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2640:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'width' this_COLON_15= RULE_COLON ( (lv_width_16_0= ruleEDouble ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'height' this_COLON_19= RULE_COLON ( (lv_height_20_0= ruleEDouble ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2641:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'width' this_COLON_15= RULE_COLON ( (lv_width_16_0= ruleEDouble ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'height' this_COLON_19= RULE_COLON ( (lv_height_20_0= ruleEDouble ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2641:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'width' this_COLON_15= RULE_COLON ( (lv_width_16_0= ruleEDouble ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'height' this_COLON_19= RULE_COLON ( (lv_height_20_0= ruleEDouble ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2642:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'width' this_COLON_15= RULE_COLON ( (lv_width_16_0= ruleEDouble ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'height' this_COLON_19= RULE_COLON ( (lv_height_20_0= ruleEDouble ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2642:3: ()
            // InternalC2fDSL.g:2643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_53); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getImageAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getImageKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getImageAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:2661:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:2662:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:2662:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:2663:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImageAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_54); 

            			newLeafNode(this_COMMA_5, grammarAccess.getImageAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:2684:3: (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalC2fDSL.g:2685:4: otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getImageAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getImageAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:2693:4: ( (lv_displayName_8_0= ruleEString ) )
                    // InternalC2fDSL.g:2694:5: (lv_displayName_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2694:5: (lv_displayName_8_0= ruleEString )
                    // InternalC2fDSL.g:2695:6: lv_displayName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getDisplayNameEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_55); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getImageAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2717:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalC2fDSL.g:2718:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getImageAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getImageAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:2726:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:2727:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2727:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:2728:6: lv_description_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_56); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getImageAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2750:3: (otherlv_14= 'width' this_COLON_15= RULE_COLON ( (lv_width_16_0= ruleEDouble ) ) this_COMMA_17= RULE_COMMA )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalC2fDSL.g:2751:4: otherlv_14= 'width' this_COLON_15= RULE_COLON ( (lv_width_16_0= ruleEDouble ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getImageAccess().getWidthKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_57); 

                    				newLeafNode(this_COLON_15, grammarAccess.getImageAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:2759:4: ( (lv_width_16_0= ruleEDouble ) )
                    // InternalC2fDSL.g:2760:5: (lv_width_16_0= ruleEDouble )
                    {
                    // InternalC2fDSL.g:2760:5: (lv_width_16_0= ruleEDouble )
                    // InternalC2fDSL.g:2761:6: lv_width_16_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getWidthEDoubleParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_width_16_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_58); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getImageAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2783:3: (otherlv_18= 'height' this_COLON_19= RULE_COLON ( (lv_height_20_0= ruleEDouble ) ) this_COMMA_21= RULE_COMMA )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalC2fDSL.g:2784:4: otherlv_18= 'height' this_COLON_19= RULE_COLON ( (lv_height_20_0= ruleEDouble ) ) this_COMMA_21= RULE_COMMA
                    {
                    otherlv_18=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getImageAccess().getHeightKeyword_9_0());
                    			
                    this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_57); 

                    				newLeafNode(this_COLON_19, grammarAccess.getImageAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    // InternalC2fDSL.g:2792:4: ( (lv_height_20_0= ruleEDouble ) )
                    // InternalC2fDSL.g:2793:5: (lv_height_20_0= ruleEDouble )
                    {
                    // InternalC2fDSL.g:2793:5: (lv_height_20_0= ruleEDouble )
                    // InternalC2fDSL.g:2794:6: lv_height_20_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getHeightEDoubleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_height_20_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_20_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_21=(Token)match(input,RULE_COMMA,FOLLOW_51); 

                    				newLeafNode(this_COMMA_21, grammarAccess.getImageAccess().getCOMMATerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2816:3: (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalC2fDSL.g:2817:4: otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getImageAccess().getPropertyKeyword_10_0());
                    			
                    this_COLON_23=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_23, grammarAccess.getImageAccess().getCOLONTerminalRuleCall_10_1());
                    			
                    // InternalC2fDSL.g:2825:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:2826:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:2826:5: ( ruleEString )
                    // InternalC2fDSL.g:2827:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getImageAccess().getPropertyStructuralFeatureCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_25=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_25, grammarAccess.getImageAccess().getBRACESCLOSETerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleList"
    // InternalC2fDSL.g:2850:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalC2fDSL.g:2850:45: (iv_ruleList= ruleList EOF )
            // InternalC2fDSL.g:2851:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalC2fDSL.g:2857:1: ruleList returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'list' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_COMMA_21=null;
        Token otherlv_22=null;
        Token this_COLON_23=null;
        Token this_BRACESCLOSE_25=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_multiple_8_0 = null;

        AntlrDatatypeRuleToken lv_displayName_12_0 = null;

        AntlrDatatypeRuleToken lv_description_16_0 = null;

        AntlrDatatypeRuleToken lv_label_20_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2863:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'list' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2864:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'list' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2864:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'list' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2865:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'list' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2865:3: ()
            // InternalC2fDSL.g:2866:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListAccess().getListAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_59); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getListAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getListAccess().getListKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getListAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:2884:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:2885:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:2885:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:2886:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getListAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_60); 

            			newLeafNode(this_COMMA_5, grammarAccess.getListAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:2907:3: (otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalC2fDSL.g:2908:4: otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getListAccess().getMultipleKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_23); 

                    				newLeafNode(this_COLON_7, grammarAccess.getListAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:2916:4: ( (lv_multiple_8_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:2917:5: (lv_multiple_8_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:2917:5: (lv_multiple_8_0= ruleEBoolean )
                    // InternalC2fDSL.g:2918:6: lv_multiple_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getMultipleEBooleanParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_multiple_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"multiple",
                    							lv_multiple_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_48); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getListAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2940:3: (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalC2fDSL.g:2941:4: otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getListAccess().getDisplayNameKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getListAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:2949:4: ( (lv_displayName_12_0= ruleEString ) )
                    // InternalC2fDSL.g:2950:5: (lv_displayName_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2950:5: (lv_displayName_12_0= ruleEString )
                    // InternalC2fDSL.g:2951:6: lv_displayName_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getDisplayNameEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_49); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getListAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2973:3: (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalC2fDSL.g:2974:4: otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getListAccess().getDescriptionKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getListAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:2982:4: ( (lv_description_16_0= ruleEString ) )
                    // InternalC2fDSL.g:2983:5: (lv_description_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2983:5: (lv_description_16_0= ruleEString )
                    // InternalC2fDSL.g:2984:6: lv_description_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getDescriptionEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_50); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getListAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3006:3: (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalC2fDSL.g:3007:4: otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getListAccess().getLabelKeyword_9_0());
                    			
                    this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_19, grammarAccess.getListAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    // InternalC2fDSL.g:3015:4: ( (lv_label_20_0= ruleEString ) )
                    // InternalC2fDSL.g:3016:5: (lv_label_20_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3016:5: (lv_label_20_0= ruleEString )
                    // InternalC2fDSL.g:3017:6: lv_label_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getLabelEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_label_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_20_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_21=(Token)match(input,RULE_COMMA,FOLLOW_51); 

                    				newLeafNode(this_COMMA_21, grammarAccess.getListAccess().getCOMMATerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3039:3: (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==33) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalC2fDSL.g:3040:4: otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getListAccess().getPropertyKeyword_10_0());
                    			
                    this_COLON_23=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_23, grammarAccess.getListAccess().getCOLONTerminalRuleCall_10_1());
                    			
                    // InternalC2fDSL.g:3048:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3049:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3049:5: ( ruleEString )
                    // InternalC2fDSL.g:3050:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getListRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getListAccess().getPropertyStructuralFeatureCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_25=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_25, grammarAccess.getListAccess().getBRACESCLOSETerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleInputText"
    // InternalC2fDSL.g:3073:1: entryRuleInputText returns [EObject current=null] : iv_ruleInputText= ruleInputText EOF ;
    public final EObject entryRuleInputText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputText = null;


        try {
            // InternalC2fDSL.g:3073:50: (iv_ruleInputText= ruleInputText EOF )
            // InternalC2fDSL.g:3074:2: iv_ruleInputText= ruleInputText EOF
            {
             newCompositeNode(grammarAccess.getInputTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputText=ruleInputText();

            state._fsp--;

             current =iv_ruleInputText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputText"


    // $ANTLR start "ruleInputText"
    // InternalC2fDSL.g:3080:1: ruleInputText returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputText' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiline' this_COLON_7= RULE_COLON ( (lv_multiline_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) this_COMMA_25= RULE_COMMA )? this_BRACESCLOSE_26= RULE_BRACESCLOSE ) ;
    public final EObject ruleInputText() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_COMMA_21=null;
        Token otherlv_22=null;
        Token this_COLON_23=null;
        Token this_COMMA_25=null;
        Token this_BRACESCLOSE_26=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_multiline_8_0 = null;

        AntlrDatatypeRuleToken lv_displayName_12_0 = null;

        AntlrDatatypeRuleToken lv_description_16_0 = null;

        AntlrDatatypeRuleToken lv_label_20_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3086:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputText' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiline' this_COLON_7= RULE_COLON ( (lv_multiline_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) this_COMMA_25= RULE_COMMA )? this_BRACESCLOSE_26= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3087:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputText' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiline' this_COLON_7= RULE_COLON ( (lv_multiline_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) this_COMMA_25= RULE_COMMA )? this_BRACESCLOSE_26= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3087:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputText' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiline' this_COLON_7= RULE_COLON ( (lv_multiline_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) this_COMMA_25= RULE_COMMA )? this_BRACESCLOSE_26= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3088:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputText' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'multiline' this_COLON_7= RULE_COLON ( (lv_multiline_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) this_COMMA_25= RULE_COMMA )? this_BRACESCLOSE_26= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3088:3: ()
            // InternalC2fDSL.g:3089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputTextAccess().getInputTextAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_61); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getInputTextAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInputTextAccess().getInputTextKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getInputTextAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3107:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:3108:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:3108:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:3109:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputTextAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputTextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_62); 

            			newLeafNode(this_COMMA_5, grammarAccess.getInputTextAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:3130:3: (otherlv_6= 'multiline' this_COLON_7= RULE_COLON ( (lv_multiline_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalC2fDSL.g:3131:4: otherlv_6= 'multiline' this_COLON_7= RULE_COLON ( (lv_multiline_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputTextAccess().getMultilineKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_23); 

                    				newLeafNode(this_COLON_7, grammarAccess.getInputTextAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:3139:4: ( (lv_multiline_8_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:3140:5: (lv_multiline_8_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:3140:5: (lv_multiline_8_0= ruleEBoolean )
                    // InternalC2fDSL.g:3141:6: lv_multiline_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getInputTextAccess().getMultilineEBooleanParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_multiline_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputTextRule());
                    						}
                    						set(
                    							current,
                    							"multiline",
                    							lv_multiline_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_48); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getInputTextAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3163:3: (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalC2fDSL.g:3164:4: otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputTextAccess().getDisplayNameKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getInputTextAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:3172:4: ( (lv_displayName_12_0= ruleEString ) )
                    // InternalC2fDSL.g:3173:5: (lv_displayName_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3173:5: (lv_displayName_12_0= ruleEString )
                    // InternalC2fDSL.g:3174:6: lv_displayName_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputTextAccess().getDisplayNameEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputTextRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_49); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getInputTextAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3196:3: (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==31) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalC2fDSL.g:3197:4: otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getInputTextAccess().getDescriptionKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getInputTextAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:3205:4: ( (lv_description_16_0= ruleEString ) )
                    // InternalC2fDSL.g:3206:5: (lv_description_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3206:5: (lv_description_16_0= ruleEString )
                    // InternalC2fDSL.g:3207:6: lv_description_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputTextAccess().getDescriptionEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputTextRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_50); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getInputTextAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3229:3: (otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalC2fDSL.g:3230:4: otherlv_18= 'label' this_COLON_19= RULE_COLON ( (lv_label_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getInputTextAccess().getLabelKeyword_9_0());
                    			
                    this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_19, grammarAccess.getInputTextAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    // InternalC2fDSL.g:3238:4: ( (lv_label_20_0= ruleEString ) )
                    // InternalC2fDSL.g:3239:5: (lv_label_20_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3239:5: (lv_label_20_0= ruleEString )
                    // InternalC2fDSL.g:3240:6: lv_label_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputTextAccess().getLabelEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_label_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputTextRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_20_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_21=(Token)match(input,RULE_COMMA,FOLLOW_51); 

                    				newLeafNode(this_COMMA_21, grammarAccess.getInputTextAccess().getCOMMATerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3262:3: (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) this_COMMA_25= RULE_COMMA )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==33) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalC2fDSL.g:3263:4: otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) this_COMMA_25= RULE_COMMA
                    {
                    otherlv_22=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getInputTextAccess().getPropertyKeyword_10_0());
                    			
                    this_COLON_23=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_23, grammarAccess.getInputTextAccess().getCOLONTerminalRuleCall_10_1());
                    			
                    // InternalC2fDSL.g:3271:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3272:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3272:5: ( ruleEString )
                    // InternalC2fDSL.g:3273:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInputTextAccess().getPropertyStructuralFeatureCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_25=(Token)match(input,RULE_COMMA,FOLLOW_14); 

                    				newLeafNode(this_COMMA_25, grammarAccess.getInputTextAccess().getCOMMATerminalRuleCall_10_3());
                    			

                    }
                    break;

            }

            this_BRACESCLOSE_26=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_26, grammarAccess.getInputTextAccess().getBRACESCLOSETerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputText"


    // $ANTLR start "entryRuleStaticContainer"
    // InternalC2fDSL.g:3300:1: entryRuleStaticContainer returns [EObject current=null] : iv_ruleStaticContainer= ruleStaticContainer EOF ;
    public final EObject entryRuleStaticContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticContainer = null;


        try {
            // InternalC2fDSL.g:3300:56: (iv_ruleStaticContainer= ruleStaticContainer EOF )
            // InternalC2fDSL.g:3301:2: iv_ruleStaticContainer= ruleStaticContainer EOF
            {
             newCompositeNode(grammarAccess.getStaticContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticContainer=ruleStaticContainer();

            state._fsp--;

             current =iv_ruleStaticContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticContainer"


    // $ANTLR start "ruleStaticContainer"
    // InternalC2fDSL.g:3307:1: ruleStaticContainer returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'staticContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) ;
    public final EObject ruleStaticContainer() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_BRACKETSO_20=null;
        Token this_COMMA_22=null;
        Token this_BRACKETSC_24=null;
        Token this_BRACESCLOSE_25=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        EObject lv_elements_21_0 = null;

        EObject lv_elements_23_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3313:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'staticContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3314:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'staticContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3314:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'staticContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3315:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'staticContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC )? this_BRACESCLOSE_25= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3315:3: ()
            // InternalC2fDSL.g:3316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStaticContainerAccess().getStaticContainerAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_63); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getStaticContainerAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStaticContainerAccess().getStaticContainerKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getStaticContainerAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3334:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:3335:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:3335:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:3336:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStaticContainerAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaticContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_64); 

            			newLeafNode(this_COMMA_5, grammarAccess.getStaticContainerAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:3357:3: (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==25) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalC2fDSL.g:3358:4: otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getStaticContainerAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getStaticContainerAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:3366:4: ( (lv_displayName_8_0= ruleEString ) )
                    // InternalC2fDSL.g:3367:5: (lv_displayName_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3367:5: (lv_displayName_8_0= ruleEString )
                    // InternalC2fDSL.g:3368:6: lv_displayName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getDisplayNameEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaticContainerRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_65); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getStaticContainerAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3390:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==31) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalC2fDSL.g:3391:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getStaticContainerAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getStaticContainerAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:3399:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:3400:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3400:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:3401:6: lv_description_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaticContainerRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_66); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getStaticContainerAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3423:3: (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalC2fDSL.g:3424:4: otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getStaticContainerAccess().getEntityKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getStaticContainerAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:3432:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3433:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3433:5: ( ruleEString )
                    // InternalC2fDSL.g:3434:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStaticContainerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getEntityEntityCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_67); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getStaticContainerAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3453:3: (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==23) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalC2fDSL.g:3454:4: otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getStaticContainerAccess().getElementsKeyword_9_0());
                    			
                    this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_19, grammarAccess.getStaticContainerAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    this_BRACKETSO_20=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

                    				newLeafNode(this_BRACKETSO_20, grammarAccess.getStaticContainerAccess().getBRACKETSOTerminalRuleCall_9_2());
                    			
                    // InternalC2fDSL.g:3466:4: ( (lv_elements_21_0= ruleElementView ) )
                    // InternalC2fDSL.g:3467:5: (lv_elements_21_0= ruleElementView )
                    {
                    // InternalC2fDSL.g:3467:5: (lv_elements_21_0= ruleElementView )
                    // InternalC2fDSL.g:3468:6: lv_elements_21_0= ruleElementView
                    {

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getElementsElementViewParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elements_21_0=ruleElementView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaticContainerRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_21_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC2fDSL.g:3485:4: (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_COMMA) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalC2fDSL.g:3486:5: this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) )
                    	    {
                    	    this_COMMA_22=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_22, grammarAccess.getStaticContainerAccess().getCOMMATerminalRuleCall_9_4_0());
                    	    				
                    	    // InternalC2fDSL.g:3490:5: ( (lv_elements_23_0= ruleElementView ) )
                    	    // InternalC2fDSL.g:3491:6: (lv_elements_23_0= ruleElementView )
                    	    {
                    	    // InternalC2fDSL.g:3491:6: (lv_elements_23_0= ruleElementView )
                    	    // InternalC2fDSL.g:3492:7: lv_elements_23_0= ruleElementView
                    	    {

                    	    							newCompositeNode(grammarAccess.getStaticContainerAccess().getElementsElementViewParserRuleCall_9_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elements_23_0=ruleElementView();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStaticContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_23_0,
                    	    								"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    this_BRACKETSC_24=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

                    				newLeafNode(this_BRACKETSC_24, grammarAccess.getStaticContainerAccess().getBRACKETSCTerminalRuleCall_9_5());
                    			

                    }
                    break;

            }

            this_BRACESCLOSE_25=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_25, grammarAccess.getStaticContainerAccess().getBRACESCLOSETerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticContainer"


    // $ANTLR start "entryRuleTextArea"
    // InternalC2fDSL.g:3523:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // InternalC2fDSL.g:3523:49: (iv_ruleTextArea= ruleTextArea EOF )
            // InternalC2fDSL.g:3524:2: iv_ruleTextArea= ruleTextArea EOF
            {
             newCompositeNode(grammarAccess.getTextAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextArea=ruleTextArea();

            state._fsp--;

             current =iv_ruleTextArea; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // InternalC2fDSL.g:3530:1: ruleTextArea returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'textArea' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'isTitle' this_COLON_7= RULE_COLON ( (lv_isTitle_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'value' this_COLON_19= RULE_COLON ( (lv_value_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_COMMA_21=null;
        Token otherlv_22=null;
        Token this_COLON_23=null;
        Token this_BRACESCLOSE_25=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_isTitle_8_0 = null;

        AntlrDatatypeRuleToken lv_displayName_12_0 = null;

        AntlrDatatypeRuleToken lv_description_16_0 = null;

        AntlrDatatypeRuleToken lv_value_20_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3536:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'textArea' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'isTitle' this_COLON_7= RULE_COLON ( (lv_isTitle_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'value' this_COLON_19= RULE_COLON ( (lv_value_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3537:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'textArea' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'isTitle' this_COLON_7= RULE_COLON ( (lv_isTitle_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'value' this_COLON_19= RULE_COLON ( (lv_value_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3537:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'textArea' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'isTitle' this_COLON_7= RULE_COLON ( (lv_isTitle_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'value' this_COLON_19= RULE_COLON ( (lv_value_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3538:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'textArea' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'isTitle' this_COLON_7= RULE_COLON ( (lv_isTitle_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'value' this_COLON_19= RULE_COLON ( (lv_value_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )? (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )? this_BRACESCLOSE_25= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3538:3: ()
            // InternalC2fDSL.g:3539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextAreaAccess().getTextAreaAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_68); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getTextAreaAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAreaAccess().getTextAreaKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getTextAreaAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3557:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:3558:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:3558:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:3559:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAreaAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextAreaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_69); 

            			newLeafNode(this_COMMA_5, grammarAccess.getTextAreaAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getTextAreaAccess().getIsTitleKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_23); 

            			newLeafNode(this_COLON_7, grammarAccess.getTextAreaAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalC2fDSL.g:3588:3: ( (lv_isTitle_8_0= ruleEBoolean ) )
            // InternalC2fDSL.g:3589:4: (lv_isTitle_8_0= ruleEBoolean )
            {
            // InternalC2fDSL.g:3589:4: (lv_isTitle_8_0= ruleEBoolean )
            // InternalC2fDSL.g:3590:5: lv_isTitle_8_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getTextAreaAccess().getIsTitleEBooleanParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_isTitle_8_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextAreaRule());
            					}
            					set(
            						current,
            						"isTitle",
            						lv_isTitle_8_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_70); 

            			newLeafNode(this_COMMA_9, grammarAccess.getTextAreaAccess().getCOMMATerminalRuleCall_9());
            		
            // InternalC2fDSL.g:3611:3: (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==25) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalC2fDSL.g:3612:4: otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextAreaAccess().getDisplayNameKeyword_10_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getTextAreaAccess().getCOLONTerminalRuleCall_10_1());
                    			
                    // InternalC2fDSL.g:3620:4: ( (lv_displayName_12_0= ruleEString ) )
                    // InternalC2fDSL.g:3621:5: (lv_displayName_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3621:5: (lv_displayName_12_0= ruleEString )
                    // InternalC2fDSL.g:3622:6: lv_displayName_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getDisplayNameEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_71); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getTextAreaAccess().getCOMMATerminalRuleCall_10_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3644:3: (otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==31) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalC2fDSL.g:3645:4: otherlv_14= 'description' this_COLON_15= RULE_COLON ( (lv_description_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextAreaAccess().getDescriptionKeyword_11_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getTextAreaAccess().getCOLONTerminalRuleCall_11_1());
                    			
                    // InternalC2fDSL.g:3653:4: ( (lv_description_16_0= ruleEString ) )
                    // InternalC2fDSL.g:3654:5: (lv_description_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3654:5: (lv_description_16_0= ruleEString )
                    // InternalC2fDSL.g:3655:6: lv_description_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getDescriptionEStringParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_72); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getTextAreaAccess().getCOMMATerminalRuleCall_11_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3677:3: (otherlv_18= 'value' this_COLON_19= RULE_COLON ( (lv_value_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==39) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalC2fDSL.g:3678:4: otherlv_18= 'value' this_COLON_19= RULE_COLON ( (lv_value_20_0= ruleEString ) ) this_COMMA_21= RULE_COMMA
                    {
                    otherlv_18=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getTextAreaAccess().getValueKeyword_12_0());
                    			
                    this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_19, grammarAccess.getTextAreaAccess().getCOLONTerminalRuleCall_12_1());
                    			
                    // InternalC2fDSL.g:3686:4: ( (lv_value_20_0= ruleEString ) )
                    // InternalC2fDSL.g:3687:5: (lv_value_20_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3687:5: (lv_value_20_0= ruleEString )
                    // InternalC2fDSL.g:3688:6: lv_value_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getValueEStringParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_20_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_21=(Token)match(input,RULE_COMMA,FOLLOW_51); 

                    				newLeafNode(this_COMMA_21, grammarAccess.getTextAreaAccess().getCOMMATerminalRuleCall_12_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3710:3: (otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==33) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalC2fDSL.g:3711:4: otherlv_22= 'property' this_COLON_23= RULE_COLON ( ( ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getTextAreaAccess().getPropertyKeyword_13_0());
                    			
                    this_COLON_23=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_23, grammarAccess.getTextAreaAccess().getCOLONTerminalRuleCall_13_1());
                    			
                    // InternalC2fDSL.g:3719:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3720:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3720:5: ( ruleEString )
                    // InternalC2fDSL.g:3721:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextAreaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getPropertyStructuralFeatureCrossReference_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_25=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_25, grammarAccess.getTextAreaAccess().getBRACESCLOSETerminalRuleCall_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleIterationContainer"
    // InternalC2fDSL.g:3744:1: entryRuleIterationContainer returns [EObject current=null] : iv_ruleIterationContainer= ruleIterationContainer EOF ;
    public final EObject entryRuleIterationContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationContainer = null;


        try {
            // InternalC2fDSL.g:3744:59: (iv_ruleIterationContainer= ruleIterationContainer EOF )
            // InternalC2fDSL.g:3745:2: iv_ruleIterationContainer= ruleIterationContainer EOF
            {
             newCompositeNode(grammarAccess.getIterationContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterationContainer=ruleIterationContainer();

            state._fsp--;

             current =iv_ruleIterationContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIterationContainer"


    // $ANTLR start "ruleIterationContainer"
    // InternalC2fDSL.g:3751:1: ruleIterationContainer returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'iterationContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_COMMA_25= RULE_COMMA )? (otherlv_26= 'iterationFilters' this_COLON_27= RULE_COLON this_BRACKETSO_28= RULE_BRACKETSO ( (lv_iterationFilters_29_0= ruleIterationFilter ) ) (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )* this_BRACKETSC_32= RULE_BRACKETSC )? this_BRACESCLOSE_33= RULE_BRACESCLOSE ) ;
    public final EObject ruleIterationContainer() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_BRACKETSO_20=null;
        Token this_COMMA_22=null;
        Token this_BRACKETSC_24=null;
        Token this_COMMA_25=null;
        Token otherlv_26=null;
        Token this_COLON_27=null;
        Token this_BRACKETSO_28=null;
        Token this_COMMA_30=null;
        Token this_BRACKETSC_32=null;
        Token this_BRACESCLOSE_33=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        EObject lv_elements_21_0 = null;

        EObject lv_elements_23_0 = null;

        EObject lv_iterationFilters_29_0 = null;

        EObject lv_iterationFilters_31_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3757:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'iterationContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_COMMA_25= RULE_COMMA )? (otherlv_26= 'iterationFilters' this_COLON_27= RULE_COLON this_BRACKETSO_28= RULE_BRACKETSO ( (lv_iterationFilters_29_0= ruleIterationFilter ) ) (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )* this_BRACKETSC_32= RULE_BRACKETSC )? this_BRACESCLOSE_33= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3758:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'iterationContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_COMMA_25= RULE_COMMA )? (otherlv_26= 'iterationFilters' this_COLON_27= RULE_COLON this_BRACKETSO_28= RULE_BRACKETSO ( (lv_iterationFilters_29_0= ruleIterationFilter ) ) (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )* this_BRACKETSC_32= RULE_BRACKETSC )? this_BRACESCLOSE_33= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3758:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'iterationContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_COMMA_25= RULE_COMMA )? (otherlv_26= 'iterationFilters' this_COLON_27= RULE_COLON this_BRACKETSO_28= RULE_BRACKETSO ( (lv_iterationFilters_29_0= ruleIterationFilter ) ) (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )* this_BRACKETSC_32= RULE_BRACKETSC )? this_BRACESCLOSE_33= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3759:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'iterationContainer' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )? (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_COMMA_25= RULE_COMMA )? (otherlv_26= 'iterationFilters' this_COLON_27= RULE_COLON this_BRACKETSO_28= RULE_BRACKETSO ( (lv_iterationFilters_29_0= ruleIterationFilter ) ) (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )* this_BRACKETSC_32= RULE_BRACKETSC )? this_BRACESCLOSE_33= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3759:3: ()
            // InternalC2fDSL.g:3760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIterationContainerAccess().getIterationContainerAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_73); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getIterationContainerAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIterationContainerAccess().getIterationContainerKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3778:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:3779:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:3779:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:3780:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIterationContainerAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterationContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_74); 

            			newLeafNode(this_COMMA_5, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:3801:3: (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==25) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalC2fDSL.g:3802:4: otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getIterationContainerAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:3810:4: ( (lv_displayName_8_0= ruleEString ) )
                    // InternalC2fDSL.g:3811:5: (lv_displayName_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3811:5: (lv_displayName_8_0= ruleEString )
                    // InternalC2fDSL.g:3812:6: lv_displayName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getDisplayNameEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_75); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3834:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==31) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalC2fDSL.g:3835:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getIterationContainerAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:3843:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:3844:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3844:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:3845:6: lv_description_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_76); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3867:3: (otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalC2fDSL.g:3868:4: otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getIterationContainerAccess().getEntityKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:3876:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3877:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3877:5: ( ruleEString )
                    // InternalC2fDSL.g:3878:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIterationContainerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getEntityEntityCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_77); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3897:3: (otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_COMMA_25= RULE_COMMA )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==23) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalC2fDSL.g:3898:4: otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_COMMA_25= RULE_COMMA
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getIterationContainerAccess().getElementsKeyword_9_0());
                    			
                    this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_19, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    this_BRACKETSO_20=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

                    				newLeafNode(this_BRACKETSO_20, grammarAccess.getIterationContainerAccess().getBRACKETSOTerminalRuleCall_9_2());
                    			
                    // InternalC2fDSL.g:3910:4: ( (lv_elements_21_0= ruleElementView ) )
                    // InternalC2fDSL.g:3911:5: (lv_elements_21_0= ruleElementView )
                    {
                    // InternalC2fDSL.g:3911:5: (lv_elements_21_0= ruleElementView )
                    // InternalC2fDSL.g:3912:6: lv_elements_21_0= ruleElementView
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getElementsElementViewParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elements_21_0=ruleElementView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_21_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC2fDSL.g:3929:4: (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_COMMA) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalC2fDSL.g:3930:5: this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) )
                    	    {
                    	    this_COMMA_22=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_22, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_9_4_0());
                    	    				
                    	    // InternalC2fDSL.g:3934:5: ( (lv_elements_23_0= ruleElementView ) )
                    	    // InternalC2fDSL.g:3935:6: (lv_elements_23_0= ruleElementView )
                    	    {
                    	    // InternalC2fDSL.g:3935:6: (lv_elements_23_0= ruleElementView )
                    	    // InternalC2fDSL.g:3936:7: lv_elements_23_0= ruleElementView
                    	    {

                    	    							newCompositeNode(grammarAccess.getIterationContainerAccess().getElementsElementViewParserRuleCall_9_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elements_23_0=ruleElementView();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_23_0,
                    	    								"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    this_BRACKETSC_24=(Token)match(input,RULE_BRACKETSC,FOLLOW_6); 

                    				newLeafNode(this_BRACKETSC_24, grammarAccess.getIterationContainerAccess().getBRACKETSCTerminalRuleCall_9_5());
                    			
                    this_COMMA_25=(Token)match(input,RULE_COMMA,FOLLOW_78); 

                    				newLeafNode(this_COMMA_25, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_9_6());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3963:3: (otherlv_26= 'iterationFilters' this_COLON_27= RULE_COLON this_BRACKETSO_28= RULE_BRACKETSO ( (lv_iterationFilters_29_0= ruleIterationFilter ) ) (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )* this_BRACKETSC_32= RULE_BRACKETSC )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==60) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalC2fDSL.g:3964:4: otherlv_26= 'iterationFilters' this_COLON_27= RULE_COLON this_BRACKETSO_28= RULE_BRACKETSO ( (lv_iterationFilters_29_0= ruleIterationFilter ) ) (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )* this_BRACKETSC_32= RULE_BRACKETSC
                    {
                    otherlv_26=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_26, grammarAccess.getIterationContainerAccess().getIterationFiltersKeyword_10_0());
                    			
                    this_COLON_27=(Token)match(input,RULE_COLON,FOLLOW_11); 

                    				newLeafNode(this_COLON_27, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_10_1());
                    			
                    this_BRACKETSO_28=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

                    				newLeafNode(this_BRACKETSO_28, grammarAccess.getIterationContainerAccess().getBRACKETSOTerminalRuleCall_10_2());
                    			
                    // InternalC2fDSL.g:3976:4: ( (lv_iterationFilters_29_0= ruleIterationFilter ) )
                    // InternalC2fDSL.g:3977:5: (lv_iterationFilters_29_0= ruleIterationFilter )
                    {
                    // InternalC2fDSL.g:3977:5: (lv_iterationFilters_29_0= ruleIterationFilter )
                    // InternalC2fDSL.g:3978:6: lv_iterationFilters_29_0= ruleIterationFilter
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getIterationFiltersIterationFilterParserRuleCall_10_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_iterationFilters_29_0=ruleIterationFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    						}
                    						add(
                    							current,
                    							"iterationFilters",
                    							lv_iterationFilters_29_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.IterationFilter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC2fDSL.g:3995:4: (this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_COMMA) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalC2fDSL.g:3996:5: this_COMMA_30= RULE_COMMA ( (lv_iterationFilters_31_0= ruleIterationFilter ) )
                    	    {
                    	    this_COMMA_30=(Token)match(input,RULE_COMMA,FOLLOW_8); 

                    	    					newLeafNode(this_COMMA_30, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_10_4_0());
                    	    				
                    	    // InternalC2fDSL.g:4000:5: ( (lv_iterationFilters_31_0= ruleIterationFilter ) )
                    	    // InternalC2fDSL.g:4001:6: (lv_iterationFilters_31_0= ruleIterationFilter )
                    	    {
                    	    // InternalC2fDSL.g:4001:6: (lv_iterationFilters_31_0= ruleIterationFilter )
                    	    // InternalC2fDSL.g:4002:7: lv_iterationFilters_31_0= ruleIterationFilter
                    	    {

                    	    							newCompositeNode(grammarAccess.getIterationContainerAccess().getIterationFiltersIterationFilterParserRuleCall_10_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_iterationFilters_31_0=ruleIterationFilter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"iterationFilters",
                    	    								lv_iterationFilters_31_0,
                    	    								"co.classlayout2frontend.c2fdsl.C2fDSL.IterationFilter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    this_BRACKETSC_32=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

                    				newLeafNode(this_BRACKETSC_32, grammarAccess.getIterationContainerAccess().getBRACKETSCTerminalRuleCall_10_5());
                    			

                    }
                    break;

            }

            this_BRACESCLOSE_33=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_33, grammarAccess.getIterationContainerAccess().getBRACESCLOSETerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIterationContainer"


    // $ANTLR start "entryRuleInputForm"
    // InternalC2fDSL.g:4033:1: entryRuleInputForm returns [EObject current=null] : iv_ruleInputForm= ruleInputForm EOF ;
    public final EObject entryRuleInputForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputForm = null;


        try {
            // InternalC2fDSL.g:4033:50: (iv_ruleInputForm= ruleInputForm EOF )
            // InternalC2fDSL.g:4034:2: iv_ruleInputForm= ruleInputForm EOF
            {
             newCompositeNode(grammarAccess.getInputFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputForm=ruleInputForm();

            state._fsp--;

             current =iv_ruleInputForm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputForm"


    // $ANTLR start "ruleInputForm"
    // InternalC2fDSL.g:4040:1: ruleInputForm returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputForm' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_BRACESCLOSE_25= RULE_BRACESCLOSE ) ;
    public final EObject ruleInputForm() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_BRACKETSO_20=null;
        Token this_COMMA_22=null;
        Token this_BRACKETSC_24=null;
        Token this_BRACESCLOSE_25=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        EObject lv_elements_21_0 = null;

        EObject lv_elements_23_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:4046:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputForm' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_BRACESCLOSE_25= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:4047:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputForm' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:4047:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputForm' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_BRACESCLOSE_25= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:4048:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'inputForm' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'entity' this_COLON_15= RULE_COLON ( ( ruleEString ) ) this_COMMA_17= RULE_COMMA otherlv_18= 'elements' this_COLON_19= RULE_COLON this_BRACKETSO_20= RULE_BRACKETSO ( (lv_elements_21_0= ruleElementView ) ) (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )* this_BRACKETSC_24= RULE_BRACKETSC this_BRACESCLOSE_25= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:4048:3: ()
            // InternalC2fDSL.g:4049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputFormAccess().getInputFormAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_79); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getInputFormAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInputFormAccess().getInputFormKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getInputFormAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:4067:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:4068:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:4068:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:4069:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputFormAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputFormRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_80); 

            			newLeafNode(this_COMMA_5, grammarAccess.getInputFormAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:4090:3: (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalC2fDSL.g:4091:4: otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputFormAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getInputFormAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:4099:4: ( (lv_displayName_8_0= ruleEString ) )
                    // InternalC2fDSL.g:4100:5: (lv_displayName_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4100:5: (lv_displayName_8_0= ruleEString )
                    // InternalC2fDSL.g:4101:6: lv_displayName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputFormAccess().getDisplayNameEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputFormRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_81); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getInputFormAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:4123:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==31) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalC2fDSL.g:4124:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputFormAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getInputFormAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:4132:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:4133:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4133:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:4134:6: lv_description_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputFormAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputFormRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_82); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getInputFormAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getInputFormAccess().getEntityKeyword_8());
            		
            this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_15, grammarAccess.getInputFormAccess().getCOLONTerminalRuleCall_9());
            		
            // InternalC2fDSL.g:4164:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:4165:4: ( ruleEString )
            {
            // InternalC2fDSL.g:4165:4: ( ruleEString )
            // InternalC2fDSL.g:4166:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputFormRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputFormAccess().getEntityEntityCrossReference_10_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_15); 

            			newLeafNode(this_COMMA_17, grammarAccess.getInputFormAccess().getCOMMATerminalRuleCall_11());
            		
            otherlv_18=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getInputFormAccess().getElementsKeyword_12());
            		
            this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_19, grammarAccess.getInputFormAccess().getCOLONTerminalRuleCall_13());
            		
            this_BRACKETSO_20=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_20, grammarAccess.getInputFormAccess().getBRACKETSOTerminalRuleCall_14());
            		
            // InternalC2fDSL.g:4196:3: ( (lv_elements_21_0= ruleElementView ) )
            // InternalC2fDSL.g:4197:4: (lv_elements_21_0= ruleElementView )
            {
            // InternalC2fDSL.g:4197:4: (lv_elements_21_0= ruleElementView )
            // InternalC2fDSL.g:4198:5: lv_elements_21_0= ruleElementView
            {

            					newCompositeNode(grammarAccess.getInputFormAccess().getElementsElementViewParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_12);
            lv_elements_21_0=ruleElementView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputFormRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_21_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:4215:3: (this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalC2fDSL.g:4216:4: this_COMMA_22= RULE_COMMA ( (lv_elements_23_0= ruleElementView ) )
            	    {
            	    this_COMMA_22=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_22, grammarAccess.getInputFormAccess().getCOMMATerminalRuleCall_16_0());
            	    			
            	    // InternalC2fDSL.g:4220:4: ( (lv_elements_23_0= ruleElementView ) )
            	    // InternalC2fDSL.g:4221:5: (lv_elements_23_0= ruleElementView )
            	    {
            	    // InternalC2fDSL.g:4221:5: (lv_elements_23_0= ruleElementView )
            	    // InternalC2fDSL.g:4222:6: lv_elements_23_0= ruleElementView
            	    {

            	    						newCompositeNode(grammarAccess.getInputFormAccess().getElementsElementViewParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_elements_23_0=ruleElementView();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputFormRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_23_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            this_BRACKETSC_24=(Token)match(input,RULE_BRACKETSC,FOLLOW_14); 

            			newLeafNode(this_BRACKETSC_24, grammarAccess.getInputFormAccess().getBRACKETSCTerminalRuleCall_17());
            		
            this_BRACESCLOSE_25=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_25, grammarAccess.getInputFormAccess().getBRACESCLOSETerminalRuleCall_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputForm"


    // $ANTLR start "entryRuleCheckList"
    // InternalC2fDSL.g:4252:1: entryRuleCheckList returns [EObject current=null] : iv_ruleCheckList= ruleCheckList EOF ;
    public final EObject entryRuleCheckList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckList = null;


        try {
            // InternalC2fDSL.g:4252:50: (iv_ruleCheckList= ruleCheckList EOF )
            // InternalC2fDSL.g:4253:2: iv_ruleCheckList= ruleCheckList EOF
            {
             newCompositeNode(grammarAccess.getCheckListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckList=ruleCheckList();

            state._fsp--;

             current =iv_ruleCheckList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckList"


    // $ANTLR start "ruleCheckList"
    // InternalC2fDSL.g:4259:1: ruleCheckList returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'checkList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= ruleEString ) ) )? (otherlv_12= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_14= RULE_BRACESCLOSE ) ;
    public final EObject ruleCheckList() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_BRACESCLOSE_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_label_11_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:4265:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'checkList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= ruleEString ) ) )? (otherlv_12= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_14= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:4266:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'checkList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= ruleEString ) ) )? (otherlv_12= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_14= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:4266:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'checkList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= ruleEString ) ) )? (otherlv_12= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_14= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:4267:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'checkList' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'label' ( (lv_label_11_0= ruleEString ) ) )? (otherlv_12= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_14= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:4267:3: ()
            // InternalC2fDSL.g:4268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckListAccess().getCheckListAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_83); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getCheckListAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckListAccess().getCheckListKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getCheckListAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:4286:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:4287:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:4287:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:4288:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCheckListAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckListRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_48); 

            			newLeafNode(this_COMMA_5, grammarAccess.getCheckListAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:4309:3: (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==25) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalC2fDSL.g:4310:4: otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getCheckListAccess().getDisplayNameKeyword_6_0());
                    			
                    // InternalC2fDSL.g:4314:4: ( (lv_displayName_7_0= ruleEString ) )
                    // InternalC2fDSL.g:4315:5: (lv_displayName_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4315:5: (lv_displayName_7_0= ruleEString )
                    // InternalC2fDSL.g:4316:6: lv_displayName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckListAccess().getDisplayNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_displayName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckListRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:4334:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==31) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalC2fDSL.g:4335:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getCheckListAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalC2fDSL.g:4339:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalC2fDSL.g:4340:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4340:5: (lv_description_9_0= ruleEString )
                    // InternalC2fDSL.g:4341:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckListAccess().getDescriptionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckListRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:4359:3: (otherlv_10= 'label' ( (lv_label_11_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==47) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalC2fDSL.g:4360:4: otherlv_10= 'label' ( (lv_label_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getCheckListAccess().getLabelKeyword_8_0());
                    			
                    // InternalC2fDSL.g:4364:4: ( (lv_label_11_0= ruleEString ) )
                    // InternalC2fDSL.g:4365:5: (lv_label_11_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4365:5: (lv_label_11_0= ruleEString )
                    // InternalC2fDSL.g:4366:6: lv_label_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckListAccess().getLabelEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_label_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckListRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_11_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:4384:3: (otherlv_12= 'property' ( ( ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==33) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalC2fDSL.g:4385:4: otherlv_12= 'property' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getCheckListAccess().getPropertyKeyword_9_0());
                    			
                    // InternalC2fDSL.g:4389:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:4390:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:4390:5: ( ruleEString )
                    // InternalC2fDSL.g:4391:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheckListRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCheckListAccess().getPropertyStructuralFeatureCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_14=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_14, grammarAccess.getCheckListAccess().getBRACESCLOSETerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckList"


    // $ANTLR start "entryRuleRadioButtonGroup"
    // InternalC2fDSL.g:4414:1: entryRuleRadioButtonGroup returns [EObject current=null] : iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF ;
    public final EObject entryRuleRadioButtonGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButtonGroup = null;


        try {
            // InternalC2fDSL.g:4414:57: (iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF )
            // InternalC2fDSL.g:4415:2: iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadioButtonGroup=ruleRadioButtonGroup();

            state._fsp--;

             current =iv_ruleRadioButtonGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadioButtonGroup"


    // $ANTLR start "ruleRadioButtonGroup"
    // InternalC2fDSL.g:4421:1: ruleRadioButtonGroup returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_21= RULE_BRACESCLOSE ) ;
    public final EObject ruleRadioButtonGroup() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_COMMA_17=null;
        Token otherlv_18=null;
        Token this_COLON_19=null;
        Token this_BRACESCLOSE_21=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_label_16_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:4427:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_21= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:4428:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_21= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:4428:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_21= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:4429:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' this_COLON_19= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_21= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:4429:3: ()
            // InternalC2fDSL.g:4430:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRadioButtonGroupAccess().getRadioButtonGroupAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_84); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getRadioButtonGroupAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRadioButtonGroupAccess().getRadioKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:4448:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:4449:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:4449:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:4450:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadioButtonGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_85); 

            			newLeafNode(this_COMMA_5, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:4471:3: (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==25) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalC2fDSL.g:4472:4: otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRadioButtonGroupAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:4480:4: ( (lv_displayName_8_0= ruleEString ) )
                    // InternalC2fDSL.g:4481:5: (lv_displayName_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4481:5: (lv_displayName_8_0= ruleEString )
                    // InternalC2fDSL.g:4482:6: lv_displayName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getDisplayNameEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_displayName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadioButtonGroupRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_86); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:4504:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==31) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalC2fDSL.g:4505:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getRadioButtonGroupAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:4513:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:4514:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4514:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:4515:6: lv_description_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadioButtonGroupRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_87); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:4537:3: (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==47) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalC2fDSL.g:4538:4: otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getRadioButtonGroupAccess().getLabelKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:4546:4: ( (lv_label_16_0= ruleEString ) )
                    // InternalC2fDSL.g:4547:5: (lv_label_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4547:5: (lv_label_16_0= ruleEString )
                    // InternalC2fDSL.g:4548:6: lv_label_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getLabelEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_label_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadioButtonGroupRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_28); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getRadioButtonGroupAccess().getPropertyKeyword_9());
            		
            this_COLON_19=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_19, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalC2fDSL.g:4578:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:4579:4: ( ruleEString )
            {
            // InternalC2fDSL.g:4579:4: ( ruleEString )
            // InternalC2fDSL.g:4580:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioButtonGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getPropertyStructuralFeatureCrossReference_11_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_21=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_21, grammarAccess.getRadioButtonGroupAccess().getBRACESCLOSETerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioButtonGroup"


    // $ANTLR start "entryRuleEDouble"
    // InternalC2fDSL.g:4602:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalC2fDSL.g:4602:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalC2fDSL.g:4603:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalC2fDSL.g:4609:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:4615:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalC2fDSL.g:4616:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalC2fDSL.g:4616:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalC2fDSL.g:4617:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalC2fDSL.g:4617:3: (kw= '-' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==45) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalC2fDSL.g:4618:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_88); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:4624:3: (this_INT_1= RULE_INT )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_INT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalC2fDSL.g:4625:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_89); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,64,FOLLOW_46); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_90); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:4645:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=65 && LA85_0<=66)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalC2fDSL.g:4646:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalC2fDSL.g:4646:4: (kw= 'E' | kw= 'e' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==65) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==66) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalC2fDSL.g:4647:5: kw= 'E'
                            {
                            kw=(Token)match(input,65,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalC2fDSL.g:4653:5: kw= 'e'
                            {
                            kw=(Token)match(input,66,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalC2fDSL.g:4659:4: (kw= '-' )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==45) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalC2fDSL.g:4660:5: kw= '-'
                            {
                            kw=(Token)match(input,45,FOLLOW_46); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleIterationFilter"
    // InternalC2fDSL.g:4678:1: entryRuleIterationFilter returns [EObject current=null] : iv_ruleIterationFilter= ruleIterationFilter EOF ;
    public final EObject entryRuleIterationFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationFilter = null;


        try {
            // InternalC2fDSL.g:4678:56: (iv_ruleIterationFilter= ruleIterationFilter EOF )
            // InternalC2fDSL.g:4679:2: iv_ruleIterationFilter= ruleIterationFilter EOF
            {
             newCompositeNode(grammarAccess.getIterationFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterationFilter=ruleIterationFilter();

            state._fsp--;

             current =iv_ruleIterationFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIterationFilter"


    // $ANTLR start "ruleIterationFilter"
    // InternalC2fDSL.g:4685:1: ruleIterationFilter returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN (otherlv_2= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_4= RULE_BRACESCLOSE ) ;
    public final EObject ruleIterationFilter() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_BRACESCLOSE_4=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:4691:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN (otherlv_2= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_4= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:4692:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN (otherlv_2= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_4= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:4692:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN (otherlv_2= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_4= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:4693:3: () this_BRACESOPEN_1= RULE_BRACESOPEN (otherlv_2= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_4= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:4693:3: ()
            // InternalC2fDSL.g:4694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIterationFilterAccess().getIterationFilterAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_91); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getIterationFilterAccess().getBRACESOPENTerminalRuleCall_1());
            		
            // InternalC2fDSL.g:4704:3: (otherlv_2= 'input' ( ( ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==67) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalC2fDSL.g:4705:4: otherlv_2= 'input' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getIterationFilterAccess().getInputKeyword_2_0());
                    			
                    // InternalC2fDSL.g:4709:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:4710:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:4710:5: ( ruleEString )
                    // InternalC2fDSL.g:4711:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIterationFilterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIterationFilterAccess().getInputInputCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_4=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_4, grammarAccess.getIterationFilterAccess().getBRACESCLOSETerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIterationFilter"


    // $ANTLR start "ruleLayoutType"
    // InternalC2fDSL.g:4734:1: ruleLayoutType returns [Enumerator current=null] : ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) ) ;
    public final Enumerator ruleLayoutType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:4740:2: ( ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) ) )
            // InternalC2fDSL.g:4741:2: ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) )
            {
            // InternalC2fDSL.g:4741:2: ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) )
            int alt87=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt87=1;
                }
                break;
            case 69:
                {
                alt87=2;
                }
                break;
            case 70:
                {
                alt87=3;
                }
                break;
            case 71:
                {
                alt87=4;
                }
                break;
            case 72:
                {
                alt87=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalC2fDSL.g:4742:3: (enumLiteral_0= 'SINGLE_COLUMN' )
                    {
                    // InternalC2fDSL.g:4742:3: (enumLiteral_0= 'SINGLE_COLUMN' )
                    // InternalC2fDSL.g:4743:4: enumLiteral_0= 'SINGLE_COLUMN'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getSINGLE_COLUMNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLayoutTypeAccess().getSINGLE_COLUMNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:4750:3: (enumLiteral_1= 'TWO_COLUMNS' )
                    {
                    // InternalC2fDSL.g:4750:3: (enumLiteral_1= 'TWO_COLUMNS' )
                    // InternalC2fDSL.g:4751:4: enumLiteral_1= 'TWO_COLUMNS'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getTWO_COLUMNSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLayoutTypeAccess().getTWO_COLUMNSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC2fDSL.g:4758:3: (enumLiteral_2= 'LEFT_BAR' )
                    {
                    // InternalC2fDSL.g:4758:3: (enumLiteral_2= 'LEFT_BAR' )
                    // InternalC2fDSL.g:4759:4: enumLiteral_2= 'LEFT_BAR'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getLEFT_BAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLayoutTypeAccess().getLEFT_BAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalC2fDSL.g:4766:3: (enumLiteral_3= 'RIGHT_BAR' )
                    {
                    // InternalC2fDSL.g:4766:3: (enumLiteral_3= 'RIGHT_BAR' )
                    // InternalC2fDSL.g:4767:4: enumLiteral_3= 'RIGHT_BAR'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getRIGHT_BAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLayoutTypeAccess().getRIGHT_BAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalC2fDSL.g:4774:3: (enumLiteral_4= 'THREE_COLUMNS' )
                    {
                    // InternalC2fDSL.g:4774:3: (enumLiteral_4= 'THREE_COLUMNS' )
                    // InternalC2fDSL.g:4775:4: enumLiteral_4= 'THREE_COLUMNS'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getTHREE_COLUMNSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLayoutTypeAccess().getTHREE_COLUMNSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutType"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\22\12\uffff";
    static final String dfa_3s = "\1\4\1\77\12\uffff";
    static final String dfa_4s = "\2\uffff\1\12\1\6\1\2\1\10\1\3\1\1\1\5\1\4\1\7\1\11";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\7\35\uffff\1\4\1\6\2\uffff\1\11\1\10\1\uffff\1\3\1\uffff\1\12\1\uffff\1\5\1\uffff\1\13\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "420:2: (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001E2000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001C2000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000CA2000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C22000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C20000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002082800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002002800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020082000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800282000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800280000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800200000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000C000282000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000C000280000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000C000200000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000200000001000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0008000200000200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000C00282000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0040800282000200L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0100000082800200L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000080800200L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0100000000800200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000008282000200L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000008280000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000008200000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1100000082800200L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x1100000080800200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x1100000000800200L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x1000000000800200L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0100000082000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0100000080000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000800282000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000800280000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000001L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000008L});

}