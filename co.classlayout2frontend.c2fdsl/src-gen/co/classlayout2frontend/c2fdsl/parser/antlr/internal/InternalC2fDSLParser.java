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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BRACESOPEN", "RULE_COLON", "RULE_COMMA", "RULE_BRACKETSO", "RULE_BRACKETSC", "RULE_BRACESCLOSE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'entityModel'", "'site'", "'pages'", "'components'", "'elements'", "'templateColor'", "'displayName'", "'layoutType'", "'elementViews'", "'composition'", "'required'", "'many'", "'description'", "'target'", "'property'", "'defaultValue'", "'dataType'", "'class'", "'superclass'", "'primitive'", "'value'", "'enum'", "'literals'", "'reference'", "'true'", "'false'", "'-'", "'multiple'", "'label'", "'Dropdownlist'", "'image'", "'width'", "'height'", "'List'", "'multiline'", "'InputText'", "'entity'", "'TextArea'", "'containerType'", "'iteration'", "'iterationFilters'", "'InputForm'", "'CheckList'", "'radio'", "'.'", "'E'", "'e'", "'IterationFilter'", "'input'", "'SINGLE_COLUMN'", "'TWO_COLUMNS'", "'LEFT_BAR'", "'RIGHT_BAR'", "'THREE_COLUMNS'"
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
    // InternalC2fDSL.g:72:1: ruleProject returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'pages' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_pageViews_16_0= rulePageView ) ) (this_COMMA_17= RULE_COMMA ( (lv_pageViews_18_0= rulePageView ) ) )* this_BRACKETSC_19= RULE_BRACKETSC otherlv_20= 'components' this_BRACKETSO_21= RULE_BRACKETSO ( (lv_containerViews_22_0= ruleContainerView ) ) (this_COMMA_23= RULE_COMMA ( (lv_containerViews_24_0= ruleContainerView ) ) )* this_BRACKETSC_25= RULE_BRACKETSC this_BRACESCLOSE_26= RULE_BRACESCLOSE ) ;
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
        Token this_BRACKETSO_15=null;
        Token this_COMMA_17=null;
        Token this_BRACKETSC_19=null;
        Token otherlv_20=null;
        Token this_BRACKETSO_21=null;
        Token this_COMMA_23=null;
        Token this_BRACKETSC_25=null;
        Token this_BRACESCLOSE_26=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_entitiesmodel_8_0 = null;

        EObject lv_siteViews_12_0 = null;

        EObject lv_pageViews_16_0 = null;

        EObject lv_pageViews_18_0 = null;

        EObject lv_containerViews_22_0 = null;

        EObject lv_containerViews_24_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:78:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'pages' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_pageViews_16_0= rulePageView ) ) (this_COMMA_17= RULE_COMMA ( (lv_pageViews_18_0= rulePageView ) ) )* this_BRACKETSC_19= RULE_BRACKETSC otherlv_20= 'components' this_BRACKETSO_21= RULE_BRACKETSO ( (lv_containerViews_22_0= ruleContainerView ) ) (this_COMMA_23= RULE_COMMA ( (lv_containerViews_24_0= ruleContainerView ) ) )* this_BRACKETSC_25= RULE_BRACKETSC this_BRACESCLOSE_26= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:79:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'pages' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_pageViews_16_0= rulePageView ) ) (this_COMMA_17= RULE_COMMA ( (lv_pageViews_18_0= rulePageView ) ) )* this_BRACKETSC_19= RULE_BRACKETSC otherlv_20= 'components' this_BRACKETSO_21= RULE_BRACKETSO ( (lv_containerViews_22_0= ruleContainerView ) ) (this_COMMA_23= RULE_COMMA ( (lv_containerViews_24_0= ruleContainerView ) ) )* this_BRACKETSC_25= RULE_BRACKETSC this_BRACESCLOSE_26= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:79:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'pages' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_pageViews_16_0= rulePageView ) ) (this_COMMA_17= RULE_COMMA ( (lv_pageViews_18_0= rulePageView ) ) )* this_BRACKETSC_19= RULE_BRACKETSC otherlv_20= 'components' this_BRACKETSO_21= RULE_BRACKETSO ( (lv_containerViews_22_0= ruleContainerView ) ) (this_COMMA_23= RULE_COMMA ( (lv_containerViews_24_0= ruleContainerView ) ) )* this_BRACKETSC_25= RULE_BRACKETSC this_BRACESCLOSE_26= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:80:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'entityModel' this_COLON_7= RULE_COLON ( (lv_entitiesmodel_8_0= ruleEntitiesModel ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'site' this_COLON_11= RULE_COLON ( (lv_siteViews_12_0= ruleSiteView ) ) this_COMMA_13= RULE_COMMA otherlv_14= 'pages' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_pageViews_16_0= rulePageView ) ) (this_COMMA_17= RULE_COMMA ( (lv_pageViews_18_0= rulePageView ) ) )* this_BRACKETSC_19= RULE_BRACKETSC otherlv_20= 'components' this_BRACKETSO_21= RULE_BRACKETSO ( (lv_containerViews_22_0= ruleContainerView ) ) (this_COMMA_23= RULE_COMMA ( (lv_containerViews_24_0= ruleContainerView ) ) )* this_BRACKETSC_25= RULE_BRACKETSC this_BRACESCLOSE_26= RULE_BRACESCLOSE
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
            		
            otherlv_14=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getPagesKeyword_14());
            		
            this_BRACKETSO_15=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_15, grammarAccess.getProjectAccess().getBRACKETSOTerminalRuleCall_15());
            		
            // InternalC2fDSL.g:192:3: ( (lv_pageViews_16_0= rulePageView ) )
            // InternalC2fDSL.g:193:4: (lv_pageViews_16_0= rulePageView )
            {
            // InternalC2fDSL.g:193:4: (lv_pageViews_16_0= rulePageView )
            // InternalC2fDSL.g:194:5: lv_pageViews_16_0= rulePageView
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getPageViewsPageViewParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_12);
            lv_pageViews_16_0=rulePageView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"pageViews",
            						lv_pageViews_16_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.PageView");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:211:3: (this_COMMA_17= RULE_COMMA ( (lv_pageViews_18_0= rulePageView ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalC2fDSL.g:212:4: this_COMMA_17= RULE_COMMA ( (lv_pageViews_18_0= rulePageView ) )
            	    {
            	    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_17, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_17_0());
            	    			
            	    // InternalC2fDSL.g:216:4: ( (lv_pageViews_18_0= rulePageView ) )
            	    // InternalC2fDSL.g:217:5: (lv_pageViews_18_0= rulePageView )
            	    {
            	    // InternalC2fDSL.g:217:5: (lv_pageViews_18_0= rulePageView )
            	    // InternalC2fDSL.g:218:6: lv_pageViews_18_0= rulePageView
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getPageViewsPageViewParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_pageViews_18_0=rulePageView();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pageViews",
            	    							lv_pageViews_18_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.PageView");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_BRACKETSC_19=(Token)match(input,RULE_BRACKETSC,FOLLOW_13); 

            			newLeafNode(this_BRACKETSC_19, grammarAccess.getProjectAccess().getBRACKETSCTerminalRuleCall_18());
            		
            otherlv_20=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_20, grammarAccess.getProjectAccess().getComponentsKeyword_19());
            		
            this_BRACKETSO_21=(Token)match(input,RULE_BRACKETSO,FOLLOW_14); 

            			newLeafNode(this_BRACKETSO_21, grammarAccess.getProjectAccess().getBRACKETSOTerminalRuleCall_20());
            		
            // InternalC2fDSL.g:248:3: ( (lv_containerViews_22_0= ruleContainerView ) )
            // InternalC2fDSL.g:249:4: (lv_containerViews_22_0= ruleContainerView )
            {
            // InternalC2fDSL.g:249:4: (lv_containerViews_22_0= ruleContainerView )
            // InternalC2fDSL.g:250:5: lv_containerViews_22_0= ruleContainerView
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getContainerViewsContainerViewParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_12);
            lv_containerViews_22_0=ruleContainerView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					add(
            						current,
            						"containerViews",
            						lv_containerViews_22_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.ContainerView");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalC2fDSL.g:267:3: (this_COMMA_23= RULE_COMMA ( (lv_containerViews_24_0= ruleContainerView ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalC2fDSL.g:268:4: this_COMMA_23= RULE_COMMA ( (lv_containerViews_24_0= ruleContainerView ) )
            	    {
            	    this_COMMA_23=(Token)match(input,RULE_COMMA,FOLLOW_14); 

            	    				newLeafNode(this_COMMA_23, grammarAccess.getProjectAccess().getCOMMATerminalRuleCall_22_0());
            	    			
            	    // InternalC2fDSL.g:272:4: ( (lv_containerViews_24_0= ruleContainerView ) )
            	    // InternalC2fDSL.g:273:5: (lv_containerViews_24_0= ruleContainerView )
            	    {
            	    // InternalC2fDSL.g:273:5: (lv_containerViews_24_0= ruleContainerView )
            	    // InternalC2fDSL.g:274:6: lv_containerViews_24_0= ruleContainerView
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getContainerViewsContainerViewParserRuleCall_22_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_containerViews_24_0=ruleContainerView();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"containerViews",
            	    							lv_containerViews_24_0,
            	    							"co.classlayout2frontend.c2fdsl.C2fDSL.ContainerView");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_BRACKETSC_25=(Token)match(input,RULE_BRACKETSC,FOLLOW_15); 

            			newLeafNode(this_BRACKETSC_25, grammarAccess.getProjectAccess().getBRACKETSCTerminalRuleCall_23());
            		
            this_BRACESCLOSE_26=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_26, grammarAccess.getProjectAccess().getBRACESCLOSETerminalRuleCall_24());
            		

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
    // InternalC2fDSL.g:304:1: entryRuleContainerView returns [EObject current=null] : iv_ruleContainerView= ruleContainerView EOF ;
    public final EObject entryRuleContainerView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerView = null;


        try {
            // InternalC2fDSL.g:304:54: (iv_ruleContainerView= ruleContainerView EOF )
            // InternalC2fDSL.g:305:2: iv_ruleContainerView= ruleContainerView EOF
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
    // InternalC2fDSL.g:311:1: ruleContainerView returns [EObject current=null] : (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm ) ;
    public final EObject ruleContainerView() throws RecognitionException {
        EObject current = null;

        EObject this_StaticContainer_0 = null;

        EObject this_IterationContainer_1 = null;

        EObject this_InputForm_2 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:317:2: ( (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm ) )
            // InternalC2fDSL.g:318:2: (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm )
            {
            // InternalC2fDSL.g:318:2: (this_StaticContainer_0= ruleStaticContainer | this_IterationContainer_1= ruleIterationContainer | this_InputForm_2= ruleInputForm )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_BRACESOPEN:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 60:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalC2fDSL.g:319:3: this_StaticContainer_0= ruleStaticContainer
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
                    // InternalC2fDSL.g:328:3: this_IterationContainer_1= ruleIterationContainer
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
                    // InternalC2fDSL.g:337:3: this_InputForm_2= ruleInputForm
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
    // InternalC2fDSL.g:349:1: entryRuleEntityModelElement returns [EObject current=null] : iv_ruleEntityModelElement= ruleEntityModelElement EOF ;
    public final EObject entryRuleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModelElement = null;


        try {
            // InternalC2fDSL.g:349:59: (iv_ruleEntityModelElement= ruleEntityModelElement EOF )
            // InternalC2fDSL.g:350:2: iv_ruleEntityModelElement= ruleEntityModelElement EOF
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
    // InternalC2fDSL.g:356:1: ruleEntityModelElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_PrimitiveType_1 = null;

        EObject this_Enumeration_2 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:362:2: ( (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration ) )
            // InternalC2fDSL.g:363:2: (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration )
            {
            // InternalC2fDSL.g:363:2: (this_Entity_0= ruleEntity | this_PrimitiveType_1= rulePrimitiveType | this_Enumeration_2= ruleEnumeration )
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
                    // InternalC2fDSL.g:364:3: this_Entity_0= ruleEntity
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
                    // InternalC2fDSL.g:373:3: this_PrimitiveType_1= rulePrimitiveType
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
                    // InternalC2fDSL.g:382:3: this_Enumeration_2= ruleEnumeration
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
    // InternalC2fDSL.g:394:1: entryRuleElementView returns [EObject current=null] : iv_ruleElementView= ruleElementView EOF ;
    public final EObject entryRuleElementView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementView = null;


        try {
            // InternalC2fDSL.g:394:52: (iv_ruleElementView= ruleElementView EOF )
            // InternalC2fDSL.g:395:2: iv_ruleElementView= ruleElementView EOF
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
    // InternalC2fDSL.g:401:1: ruleElementView returns [EObject current=null] : (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup ) ;
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
            // InternalC2fDSL.g:407:2: ( (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup ) )
            // InternalC2fDSL.g:408:2: (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup )
            {
            // InternalC2fDSL.g:408:2: (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalC2fDSL.g:409:3: this_Autocomplete_0= ruleAutocomplete
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
                    // InternalC2fDSL.g:418:3: this_Dropdownlist_1= ruleDropdownlist
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
                    // InternalC2fDSL.g:427:3: this_Image_2= ruleImage
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
                    // InternalC2fDSL.g:436:3: this_List_3= ruleList
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
                    // InternalC2fDSL.g:445:3: this_InputText_4= ruleInputText
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
                    // InternalC2fDSL.g:454:3: this_StaticContainer_5= ruleStaticContainer
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
                    // InternalC2fDSL.g:463:3: this_TextArea_6= ruleTextArea
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
                    // InternalC2fDSL.g:472:3: this_IterationContainer_7= ruleIterationContainer
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
                    // InternalC2fDSL.g:481:3: this_InputForm_8= ruleInputForm
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
                    // InternalC2fDSL.g:490:3: this_RadioButtonGroup_9= ruleRadioButtonGroup
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
    // InternalC2fDSL.g:502:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // InternalC2fDSL.g:502:58: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // InternalC2fDSL.g:503:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
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
    // InternalC2fDSL.g:509:1: ruleStructuralFeature returns [EObject current=null] : (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Composition_0 = null;

        EObject this_Property_1 = null;

        EObject this_Reference_2 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:515:2: ( (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference ) )
            // InternalC2fDSL.g:516:2: (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference )
            {
            // InternalC2fDSL.g:516:2: (this_Composition_0= ruleComposition | this_Property_1= ruleProperty | this_Reference_2= ruleReference )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BRACESOPEN) ) {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt6=3;
                    }
                    break;
                case 28:
                    {
                    alt6=1;
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
                    // InternalC2fDSL.g:517:3: this_Composition_0= ruleComposition
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
                    // InternalC2fDSL.g:526:3: this_Property_1= ruleProperty
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
                    // InternalC2fDSL.g:535:3: this_Reference_2= ruleReference
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
    // InternalC2fDSL.g:547:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalC2fDSL.g:547:47: (iv_ruleEString= ruleEString EOF )
            // InternalC2fDSL.g:548:2: iv_ruleEString= ruleEString EOF
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
    // InternalC2fDSL.g:554:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:560:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalC2fDSL.g:561:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalC2fDSL.g:561:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalC2fDSL.g:562:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:570:3: this_ID_1= RULE_ID
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
    // InternalC2fDSL.g:581:1: entryRuleEntitiesModel returns [EObject current=null] : iv_ruleEntitiesModel= ruleEntitiesModel EOF ;
    public final EObject entryRuleEntitiesModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitiesModel = null;


        try {
            // InternalC2fDSL.g:581:54: (iv_ruleEntitiesModel= ruleEntitiesModel EOF )
            // InternalC2fDSL.g:582:2: iv_ruleEntitiesModel= ruleEntitiesModel EOF
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
    // InternalC2fDSL.g:588:1: ruleEntitiesModel returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:594:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:595:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:595:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:596:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'elements' this_COLON_7= RULE_COLON this_BRACKETSO_8= RULE_BRACKETSO ( (lv_modelElements_9_0= ruleEntityModelElement ) ) (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )* this_BRACKETSC_12= RULE_BRACKETSC this_BRACESCLOSE_13= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:596:3: ()
            // InternalC2fDSL.g:597:4: 
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
            		
            // InternalC2fDSL.g:615:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:616:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:616:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:617:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_16); 

            			newLeafNode(this_COMMA_5, grammarAccess.getEntitiesModelAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getEntitiesModelAccess().getElementsKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_7, grammarAccess.getEntitiesModelAccess().getCOLONTerminalRuleCall_7());
            		
            this_BRACKETSO_8=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_8, grammarAccess.getEntitiesModelAccess().getBRACKETSOTerminalRuleCall_8());
            		
            // InternalC2fDSL.g:650:3: ( (lv_modelElements_9_0= ruleEntityModelElement ) )
            // InternalC2fDSL.g:651:4: (lv_modelElements_9_0= ruleEntityModelElement )
            {
            // InternalC2fDSL.g:651:4: (lv_modelElements_9_0= ruleEntityModelElement )
            // InternalC2fDSL.g:652:5: lv_modelElements_9_0= ruleEntityModelElement
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

            // InternalC2fDSL.g:669:3: (this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalC2fDSL.g:670:4: this_COMMA_10= RULE_COMMA ( (lv_modelElements_11_0= ruleEntityModelElement ) )
            	    {
            	    this_COMMA_10=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_10, grammarAccess.getEntitiesModelAccess().getCOMMATerminalRuleCall_10_0());
            	    			
            	    // InternalC2fDSL.g:674:4: ( (lv_modelElements_11_0= ruleEntityModelElement ) )
            	    // InternalC2fDSL.g:675:5: (lv_modelElements_11_0= ruleEntityModelElement )
            	    {
            	    // InternalC2fDSL.g:675:5: (lv_modelElements_11_0= ruleEntityModelElement )
            	    // InternalC2fDSL.g:676:6: lv_modelElements_11_0= ruleEntityModelElement
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

            this_BRACKETSC_12=(Token)match(input,RULE_BRACKETSC,FOLLOW_15); 

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
    // InternalC2fDSL.g:706:1: entryRuleSiteView returns [EObject current=null] : iv_ruleSiteView= ruleSiteView EOF ;
    public final EObject entryRuleSiteView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteView = null;


        try {
            // InternalC2fDSL.g:706:49: (iv_ruleSiteView= ruleSiteView EOF )
            // InternalC2fDSL.g:707:2: iv_ruleSiteView= ruleSiteView EOF
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
    // InternalC2fDSL.g:713:1: ruleSiteView returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:719:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:720:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:720:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:721:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA this_BRACESCLOSE_14= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:721:3: ()
            // InternalC2fDSL.g:722:4: 
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
            		
            // InternalC2fDSL.g:740:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:741:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:741:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:742:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_17); 

            			newLeafNode(this_COMMA_5, grammarAccess.getSiteViewAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:763:3: (otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalC2fDSL.g:764:4: otherlv_6= 'templateColor' this_COLON_7= RULE_COLON ( (lv_templateColor_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSiteViewAccess().getTemplateColorKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getSiteViewAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:772:4: ( (lv_templateColor_8_0= ruleEString ) )
                    // InternalC2fDSL.g:773:5: (lv_templateColor_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:773:5: (lv_templateColor_8_0= ruleEString )
                    // InternalC2fDSL.g:774:6: lv_templateColor_8_0= ruleEString
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

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_18); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getSiteViewAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSiteViewAccess().getDisplayNameKeyword_7());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_11, grammarAccess.getSiteViewAccess().getCOLONTerminalRuleCall_8());
            		
            // InternalC2fDSL.g:804:3: ( (lv_displayName_12_0= ruleEString ) )
            // InternalC2fDSL.g:805:4: (lv_displayName_12_0= ruleEString )
            {
            // InternalC2fDSL.g:805:4: (lv_displayName_12_0= ruleEString )
            // InternalC2fDSL.g:806:5: lv_displayName_12_0= ruleEString
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

            this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_15); 

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
    // InternalC2fDSL.g:835:1: entryRulePageView returns [EObject current=null] : iv_rulePageView= rulePageView EOF ;
    public final EObject entryRulePageView() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageView = null;


        try {
            // InternalC2fDSL.g:835:49: (iv_rulePageView= rulePageView EOF )
            // InternalC2fDSL.g:836:2: iv_rulePageView= rulePageView EOF
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
    // InternalC2fDSL.g:842:1: rulePageView returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:848:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:849:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:849:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:850:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'layoutType' this_COLON_7= RULE_COLON ( (lv_layoutType_8_0= ruleLayoutType ) ) this_COMMA_9= RULE_COMMA otherlv_10= 'elementViews' this_COLON_11= RULE_COLON this_BRACKETSO_12= RULE_BRACKETSO ( ( ruleEString ) ) (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )* this_BRACKETSC_16= RULE_BRACKETSC this_BRACESCLOSE_17= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:850:3: ()
            // InternalC2fDSL.g:851:4: 
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
            		
            // InternalC2fDSL.g:869:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:870:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:870:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:871:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_19); 

            			newLeafNode(this_COMMA_5, grammarAccess.getPageViewAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPageViewAccess().getLayoutTypeKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_20); 

            			newLeafNode(this_COLON_7, grammarAccess.getPageViewAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalC2fDSL.g:900:3: ( (lv_layoutType_8_0= ruleLayoutType ) )
            // InternalC2fDSL.g:901:4: (lv_layoutType_8_0= ruleLayoutType )
            {
            // InternalC2fDSL.g:901:4: (lv_layoutType_8_0= ruleLayoutType )
            // InternalC2fDSL.g:902:5: lv_layoutType_8_0= ruleLayoutType
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

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_21); 

            			newLeafNode(this_COMMA_9, grammarAccess.getPageViewAccess().getCOMMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPageViewAccess().getElementViewsKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_11); 

            			newLeafNode(this_COLON_11, grammarAccess.getPageViewAccess().getCOLONTerminalRuleCall_11());
            		
            this_BRACKETSO_12=(Token)match(input,RULE_BRACKETSO,FOLLOW_5); 

            			newLeafNode(this_BRACKETSO_12, grammarAccess.getPageViewAccess().getBRACKETSOTerminalRuleCall_12());
            		
            // InternalC2fDSL.g:935:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:936:4: ( ruleEString )
            {
            // InternalC2fDSL.g:936:4: ( ruleEString )
            // InternalC2fDSL.g:937:5: ruleEString
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

            // InternalC2fDSL.g:951:3: (this_COMMA_14= RULE_COMMA ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalC2fDSL.g:952:4: this_COMMA_14= RULE_COMMA ( ( ruleEString ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_5); 

            	    				newLeafNode(this_COMMA_14, grammarAccess.getPageViewAccess().getCOMMATerminalRuleCall_14_0());
            	    			
            	    // InternalC2fDSL.g:956:4: ( ( ruleEString ) )
            	    // InternalC2fDSL.g:957:5: ( ruleEString )
            	    {
            	    // InternalC2fDSL.g:957:5: ( ruleEString )
            	    // InternalC2fDSL.g:958:6: ruleEString
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

            this_BRACKETSC_16=(Token)match(input,RULE_BRACKETSC,FOLLOW_15); 

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
    // InternalC2fDSL.g:985:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalC2fDSL.g:985:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalC2fDSL.g:986:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalC2fDSL.g:992:1: ruleComposition returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'displayName' ( (lv_displayName_16_0= ruleEString ) ) )? otherlv_17= 'target' this_COLON_18= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE ) ;
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
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token this_COLON_18=null;
        Token this_BRACESCLOSE_20=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_required_7_0 = null;

        AntlrDatatypeRuleToken lv_many_11_0 = null;

        AntlrDatatypeRuleToken lv_description_14_0 = null;

        AntlrDatatypeRuleToken lv_displayName_16_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:998:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'displayName' ( (lv_displayName_16_0= ruleEString ) ) )? otherlv_17= 'target' this_COLON_18= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:999:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'displayName' ( (lv_displayName_16_0= ruleEString ) ) )? otherlv_17= 'target' this_COLON_18= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:999:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'displayName' ( (lv_displayName_16_0= ruleEString ) ) )? otherlv_17= 'target' this_COLON_18= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1000:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'composition' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'displayName' ( (lv_displayName_16_0= ruleEString ) ) )? otherlv_17= 'target' this_COLON_18= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_22); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getCompositionAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getCompositionKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1012:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1013:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1013:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1014:5: lv_name_3_0= ruleEString
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

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_23); 

            			newLeafNode(this_COMMA_4, grammarAccess.getCompositionAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalC2fDSL.g:1035:3: (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalC2fDSL.g:1036:4: otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getRequiredKeyword_5_0());
                    			
                    this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_24); 

                    				newLeafNode(this_COLON_6, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_5_1());
                    			
                    // InternalC2fDSL.g:1044:4: ( (lv_required_7_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:1045:5: (lv_required_7_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:1045:5: (lv_required_7_0= ruleEBoolean )
                    // InternalC2fDSL.g:1046:6: lv_required_7_0= ruleEBoolean
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

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_25); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getCompositionAccess().getCOMMATerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1068:3: (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalC2fDSL.g:1069:4: otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositionAccess().getManyKeyword_6_0());
                    			
                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_24); 

                    				newLeafNode(this_COLON_10, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1077:4: ( (lv_many_11_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:1078:5: (lv_many_11_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:1078:5: (lv_many_11_0= ruleEBoolean )
                    // InternalC2fDSL.g:1079:6: lv_many_11_0= ruleEBoolean
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

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_26); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getCompositionAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1101:3: (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalC2fDSL.g:1102:4: otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalC2fDSL.g:1106:4: ( (lv_description_14_0= ruleEString ) )
                    // InternalC2fDSL.g:1107:5: (lv_description_14_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1107:5: (lv_description_14_0= ruleEString )
                    // InternalC2fDSL.g:1108:6: lv_description_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getDescriptionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_description_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
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

            // InternalC2fDSL.g:1126:3: (otherlv_15= 'displayName' ( (lv_displayName_16_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalC2fDSL.g:1127:4: otherlv_15= 'displayName' ( (lv_displayName_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositionAccess().getDisplayNameKeyword_8_0());
                    			
                    // InternalC2fDSL.g:1131:4: ( (lv_displayName_16_0= ruleEString ) )
                    // InternalC2fDSL.g:1132:5: (lv_displayName_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1132:5: (lv_displayName_16_0= ruleEString )
                    // InternalC2fDSL.g:1133:6: lv_displayName_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getDisplayNameEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_displayName_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_16_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getCompositionAccess().getTargetKeyword_9());
            		
            this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_18, grammarAccess.getCompositionAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalC2fDSL.g:1159:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:1160:4: ( ruleEString )
            {
            // InternalC2fDSL.g:1160:4: ( ruleEString )
            // InternalC2fDSL.g:1161:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositionAccess().getTargetEntityCrossReference_11_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_20=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_20, grammarAccess.getCompositionAccess().getBRACESCLOSETerminalRuleCall_12());
            		

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
    // InternalC2fDSL.g:1183:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalC2fDSL.g:1183:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalC2fDSL.g:1184:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalC2fDSL.g:1190:1: ruleProperty returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) )? otherlv_20= 'dataType' ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE ) ;
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
        Token otherlv_20=null;
        Token this_BRACESCLOSE_22=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_displayName_11_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_15_0 = null;

        AntlrDatatypeRuleToken lv_required_19_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1196:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) )? otherlv_20= 'dataType' ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1197:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) )? otherlv_20= 'dataType' ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1197:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) )? otherlv_20= 'dataType' ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1198:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'property' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) )? otherlv_20= 'dataType' ( ( ruleEString ) ) this_BRACESCLOSE_22= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_29); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getPropertyAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1210:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1211:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1211:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1212:5: lv_name_3_0= ruleEString
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

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_30); 

            			newLeafNode(this_COMMA_4, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalC2fDSL.g:1233:3: (otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalC2fDSL.g:1234:4: otherlv_5= 'description' this_COLON_6= RULE_COLON ( (lv_description_7_0= ruleEString ) ) this_COMMA_8= RULE_COMMA
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDescriptionKeyword_5_0());
                    			
                    this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_6, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_5_1());
                    			
                    // InternalC2fDSL.g:1242:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalC2fDSL.g:1243:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1243:5: (lv_description_7_0= ruleEString )
                    // InternalC2fDSL.g:1244:6: lv_description_7_0= ruleEString
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

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_31); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1266:3: (otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalC2fDSL.g:1267:4: otherlv_9= 'displayName' this_COLON_10= RULE_COLON ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_10, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1275:4: ( (lv_displayName_11_0= ruleEString ) )
                    // InternalC2fDSL.g:1276:5: (lv_displayName_11_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1276:5: (lv_displayName_11_0= ruleEString )
                    // InternalC2fDSL.g:1277:6: lv_displayName_11_0= ruleEString
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

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_32); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1299:3: (otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalC2fDSL.g:1300:4: otherlv_13= 'defaultValue' this_COLON_14= RULE_COLON ( (lv_defaultValue_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getPropertyAccess().getDefaultValueKeyword_7_0());
                    			
                    this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_14, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:1308:4: ( (lv_defaultValue_15_0= ruleEString ) )
                    // InternalC2fDSL.g:1309:5: (lv_defaultValue_15_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1309:5: (lv_defaultValue_15_0= ruleEString )
                    // InternalC2fDSL.g:1310:6: lv_defaultValue_15_0= ruleEString
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

                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_33); 

                    				newLeafNode(this_COMMA_16, grammarAccess.getPropertyAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1332:3: (otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalC2fDSL.g:1333:4: otherlv_17= 'required' this_COLON_18= RULE_COLON ( (lv_required_19_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getPropertyAccess().getRequiredKeyword_8_0());
                    			
                    this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_24); 

                    				newLeafNode(this_COLON_18, grammarAccess.getPropertyAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:1341:4: ( (lv_required_19_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:1342:5: (lv_required_19_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:1342:5: (lv_required_19_0= ruleEBoolean )
                    // InternalC2fDSL.g:1343:6: lv_required_19_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getRequiredEBooleanParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_34);
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


                    }
                    break;

            }

            otherlv_20=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_20, grammarAccess.getPropertyAccess().getDataTypeKeyword_9());
            		
            // InternalC2fDSL.g:1365:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:1366:4: ( ruleEString )
            {
            // InternalC2fDSL.g:1366:4: ( ruleEString )
            // InternalC2fDSL.g:1367:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypePropertyTypeCrossReference_10_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_22=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_22, grammarAccess.getPropertyAccess().getBRACESCLOSETerminalRuleCall_11());
            		

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
    // InternalC2fDSL.g:1389:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalC2fDSL.g:1389:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalC2fDSL.g:1390:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalC2fDSL.g:1396:1: ruleEntity returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:1402:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1403:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1403:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1404:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'class' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )? otherlv_17= 'elements' this_COLON_18= RULE_COLON this_BRACKETSO_19= RULE_BRACKETSO ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) ) (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )* this_BRACKETSC_23= RULE_BRACKETSC this_BRACESCLOSE_24= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:1404:3: ()
            // InternalC2fDSL.g:1405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_35); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getEntityAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getClassKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getEntityAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:1423:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:1424:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:1424:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:1425:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_36); 

            			newLeafNode(this_COMMA_5, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:1446:3: (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalC2fDSL.g:1447:4: otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getDescriptionKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getEntityAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1455:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalC2fDSL.g:1456:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1456:5: (lv_description_8_0= ruleEString )
                    // InternalC2fDSL.g:1457:6: lv_description_8_0= ruleEString
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

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_37); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1479:3: (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalC2fDSL.g:1480:4: otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getDisplayNameKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getEntityAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:1488:4: ( (lv_displayName_12_0= ruleEString ) )
                    // InternalC2fDSL.g:1489:5: (lv_displayName_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1489:5: (lv_displayName_12_0= ruleEString )
                    // InternalC2fDSL.g:1490:6: lv_displayName_12_0= ruleEString
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

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_38); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1512:3: (otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalC2fDSL.g:1513:4: otherlv_14= 'superclass' ( ( ruleEString ) ) this_COMMA_16= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getSuperclassKeyword_8_0());
                    			
                    // InternalC2fDSL.g:1517:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:1518:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:1518:5: ( ruleEString )
                    // InternalC2fDSL.g:1519:6: ruleEString
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

                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_16); 

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
            		
            // InternalC2fDSL.g:1550:3: ( (lv_structuralFeatures_20_0= ruleStructuralFeature ) )
            // InternalC2fDSL.g:1551:4: (lv_structuralFeatures_20_0= ruleStructuralFeature )
            {
            // InternalC2fDSL.g:1551:4: (lv_structuralFeatures_20_0= ruleStructuralFeature )
            // InternalC2fDSL.g:1552:5: lv_structuralFeatures_20_0= ruleStructuralFeature
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

            // InternalC2fDSL.g:1569:3: (this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalC2fDSL.g:1570:4: this_COMMA_21= RULE_COMMA ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) )
            	    {
            	    this_COMMA_21=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_21, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_13_0());
            	    			
            	    // InternalC2fDSL.g:1574:4: ( (lv_structuralFeatures_22_0= ruleStructuralFeature ) )
            	    // InternalC2fDSL.g:1575:5: (lv_structuralFeatures_22_0= ruleStructuralFeature )
            	    {
            	    // InternalC2fDSL.g:1575:5: (lv_structuralFeatures_22_0= ruleStructuralFeature )
            	    // InternalC2fDSL.g:1576:6: lv_structuralFeatures_22_0= ruleStructuralFeature
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

            this_BRACKETSC_23=(Token)match(input,RULE_BRACKETSC,FOLLOW_15); 

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
    // InternalC2fDSL.g:1606:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalC2fDSL.g:1606:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalC2fDSL.g:1607:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalC2fDSL.g:1613:1: rulePrimitiveType returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_BRACESCLOSE_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:1619:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1620:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1620:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1621:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'primitive' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_BRACESCLOSE_5= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:1621:3: ()
            // InternalC2fDSL.g:1622:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_39); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getPrimitiveTypeAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getPrimitiveKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getPrimitiveTypeAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:1640:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:1641:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:1641:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:1642:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
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
    // InternalC2fDSL.g:1667:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalC2fDSL.g:1667:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalC2fDSL.g:1668:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalC2fDSL.g:1674:1: ruleLiteral returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:1680:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1681:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1681:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1682:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'name' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA otherlv_5= 'value' ( (lv_value_6_0= ruleEInt ) ) this_BRACESCLOSE_7= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getLiteralAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getNameKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getLiteralAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1694:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1695:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1695:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1696:5: lv_name_3_0= ruleEString
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

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_40); 

            			newLeafNode(this_COMMA_4, grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getLiteralAccess().getValueKeyword_5());
            		
            // InternalC2fDSL.g:1721:3: ( (lv_value_6_0= ruleEInt ) )
            // InternalC2fDSL.g:1722:4: (lv_value_6_0= ruleEInt )
            {
            // InternalC2fDSL.g:1722:4: (lv_value_6_0= ruleEInt )
            // InternalC2fDSL.g:1723:5: lv_value_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getLiteralAccess().getValueEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
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
    // InternalC2fDSL.g:1748:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalC2fDSL.g:1748:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalC2fDSL.g:1749:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalC2fDSL.g:1755:1: ruleEnumeration returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:1761:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1762:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1762:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1763:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'enum' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? otherlv_14= 'literals' this_BRACKETSO_15= RULE_BRACKETSO ( (lv_literals_16_0= ruleLiteral ) ) (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )* this_BRACKETSC_19= RULE_BRACKETSC this_BRACESCLOSE_20= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:1763:3: ()
            // InternalC2fDSL.g:1764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_42); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getEnumerationAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getEnumKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getEnumerationAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:1782:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:1783:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:1783:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:1784:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_43); 

            			newLeafNode(this_COMMA_5, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:1805:3: (otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalC2fDSL.g:1806:4: otherlv_6= 'description' this_COLON_7= RULE_COLON ( (lv_description_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getDescriptionKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getEnumerationAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:1814:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalC2fDSL.g:1815:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1815:5: (lv_description_8_0= ruleEString )
                    // InternalC2fDSL.g:1816:6: lv_description_8_0= ruleEString
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

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_44); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:1838:3: (otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalC2fDSL.g:1839:4: otherlv_10= 'displayName' this_COLON_11= RULE_COLON ( (lv_displayName_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnumerationAccess().getDisplayNameKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getEnumerationAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:1847:4: ( (lv_displayName_12_0= ruleEString ) )
                    // InternalC2fDSL.g:1848:5: (lv_displayName_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:1848:5: (lv_displayName_12_0= ruleEString )
                    // InternalC2fDSL.g:1849:6: lv_displayName_12_0= ruleEString
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

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_45); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getEnumerationAccess().getLiteralsKeyword_8());
            		
            this_BRACKETSO_15=(Token)match(input,RULE_BRACKETSO,FOLLOW_8); 

            			newLeafNode(this_BRACKETSO_15, grammarAccess.getEnumerationAccess().getBRACKETSOTerminalRuleCall_9());
            		
            // InternalC2fDSL.g:1879:3: ( (lv_literals_16_0= ruleLiteral ) )
            // InternalC2fDSL.g:1880:4: (lv_literals_16_0= ruleLiteral )
            {
            // InternalC2fDSL.g:1880:4: (lv_literals_16_0= ruleLiteral )
            // InternalC2fDSL.g:1881:5: lv_literals_16_0= ruleLiteral
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

            // InternalC2fDSL.g:1898:3: (this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalC2fDSL.g:1899:4: this_COMMA_17= RULE_COMMA ( (lv_literals_18_0= ruleLiteral ) )
            	    {
            	    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_8); 

            	    				newLeafNode(this_COMMA_17, grammarAccess.getEnumerationAccess().getCOMMATerminalRuleCall_11_0());
            	    			
            	    // InternalC2fDSL.g:1903:4: ( (lv_literals_18_0= ruleLiteral ) )
            	    // InternalC2fDSL.g:1904:5: (lv_literals_18_0= ruleLiteral )
            	    {
            	    // InternalC2fDSL.g:1904:5: (lv_literals_18_0= ruleLiteral )
            	    // InternalC2fDSL.g:1905:6: lv_literals_18_0= ruleLiteral
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

            this_BRACKETSC_19=(Token)match(input,RULE_BRACKETSC,FOLLOW_15); 

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
    // InternalC2fDSL.g:1935:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalC2fDSL.g:1935:50: (iv_ruleReference= ruleReference EOF )
            // InternalC2fDSL.g:1936:2: iv_ruleReference= ruleReference EOF
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
    // InternalC2fDSL.g:1942:1: ruleReference returns [EObject current=null] : (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:1948:2: ( (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:1949:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:1949:2: (this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:1950:3: this_BRACESOPEN_0= RULE_BRACESOPEN otherlv_1= 'reference' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleEString ) ) this_COMMA_4= RULE_COMMA (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )? (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )? (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )? otherlv_21= 'target' this_COLON_22= RULE_COLON ( ( ruleEString ) ) this_BRACESCLOSE_24= RULE_BRACESCLOSE
            {
            this_BRACESOPEN_0=(Token)match(input,RULE_BRACESOPEN,FOLLOW_46); 

            			newLeafNode(this_BRACESOPEN_0, grammarAccess.getReferenceAccess().getBRACESOPENTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getReferenceKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_2, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:1962:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:1963:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:1963:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:1964:5: lv_name_3_0= ruleEString
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

            this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_23); 

            			newLeafNode(this_COMMA_4, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_4());
            		
            // InternalC2fDSL.g:1985:3: (otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalC2fDSL.g:1986:4: otherlv_5= 'required' this_COLON_6= RULE_COLON ( (lv_required_7_0= ruleEBoolean ) ) this_COMMA_8= RULE_COMMA
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getRequiredKeyword_5_0());
                    			
                    this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_24); 

                    				newLeafNode(this_COLON_6, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_5_1());
                    			
                    // InternalC2fDSL.g:1994:4: ( (lv_required_7_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:1995:5: (lv_required_7_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:1995:5: (lv_required_7_0= ruleEBoolean )
                    // InternalC2fDSL.g:1996:6: lv_required_7_0= ruleEBoolean
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

                    this_COMMA_8=(Token)match(input,RULE_COMMA,FOLLOW_25); 

                    				newLeafNode(this_COMMA_8, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2018:3: (otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalC2fDSL.g:2019:4: otherlv_9= 'many' this_COLON_10= RULE_COLON ( (lv_many_11_0= ruleEBoolean ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getManyKeyword_6_0());
                    			
                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_24); 

                    				newLeafNode(this_COLON_10, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:2027:4: ( (lv_many_11_0= ruleEBoolean ) )
                    // InternalC2fDSL.g:2028:5: (lv_many_11_0= ruleEBoolean )
                    {
                    // InternalC2fDSL.g:2028:5: (lv_many_11_0= ruleEBoolean )
                    // InternalC2fDSL.g:2029:6: lv_many_11_0= ruleEBoolean
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

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_26); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2051:3: (otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalC2fDSL.g:2052:4: otherlv_13= 'description' this_COLON_14= RULE_COLON ( (lv_description_15_0= ruleEString ) ) this_COMMA_16= RULE_COMMA
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getReferenceAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_14, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:2060:4: ( (lv_description_15_0= ruleEString ) )
                    // InternalC2fDSL.g:2061:5: (lv_description_15_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2061:5: (lv_description_15_0= ruleEString )
                    // InternalC2fDSL.g:2062:6: lv_description_15_0= ruleEString
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

                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_27); 

                    				newLeafNode(this_COMMA_16, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2084:3: (otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalC2fDSL.g:2085:4: otherlv_17= 'displayName' this_COLON_18= RULE_COLON ( (lv_displayName_19_0= ruleEString ) ) this_COMMA_20= RULE_COMMA
                    {
                    otherlv_17=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getReferenceAccess().getDisplayNameKeyword_8_0());
                    			
                    this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_18, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:2093:4: ( (lv_displayName_19_0= ruleEString ) )
                    // InternalC2fDSL.g:2094:5: (lv_displayName_19_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2094:5: (lv_displayName_19_0= ruleEString )
                    // InternalC2fDSL.g:2095:6: lv_displayName_19_0= ruleEString
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

                    this_COMMA_20=(Token)match(input,RULE_COMMA,FOLLOW_28); 

                    				newLeafNode(this_COMMA_20, grammarAccess.getReferenceAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_21, grammarAccess.getReferenceAccess().getTargetKeyword_9());
            		
            this_COLON_22=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_22, grammarAccess.getReferenceAccess().getCOLONTerminalRuleCall_10());
            		
            // InternalC2fDSL.g:2125:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:2126:4: ( ruleEString )
            {
            // InternalC2fDSL.g:2126:4: ( ruleEString )
            // InternalC2fDSL.g:2127:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getTargetEntityCrossReference_11_0());
            				
            pushFollow(FOLLOW_15);
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
    // InternalC2fDSL.g:2149:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalC2fDSL.g:2149:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalC2fDSL.g:2150:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalC2fDSL.g:2156:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:2162:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalC2fDSL.g:2163:2: (kw= 'true' | kw= 'false' )
            {
            // InternalC2fDSL.g:2163:2: (kw= 'true' | kw= 'false' )
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
                    // InternalC2fDSL.g:2164:3: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:2170:3: kw= 'false'
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
    // InternalC2fDSL.g:2179:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalC2fDSL.g:2179:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalC2fDSL.g:2180:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalC2fDSL.g:2186:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:2192:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalC2fDSL.g:2193:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalC2fDSL.g:2193:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalC2fDSL.g:2194:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalC2fDSL.g:2194:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalC2fDSL.g:2195:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_47); 

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
    // InternalC2fDSL.g:2212:1: entryRuleAutocomplete returns [EObject current=null] : iv_ruleAutocomplete= ruleAutocomplete EOF ;
    public final EObject entryRuleAutocomplete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutocomplete = null;


        try {
            // InternalC2fDSL.g:2212:53: (iv_ruleAutocomplete= ruleAutocomplete EOF )
            // InternalC2fDSL.g:2213:2: iv_ruleAutocomplete= ruleAutocomplete EOF
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
    // InternalC2fDSL.g:2219:1: ruleAutocomplete returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE ) ;
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
            // InternalC2fDSL.g:2225:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2226:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2226:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2227:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA otherlv_6= 'multiple' this_COLON_7= RULE_COLON ( (lv_multiple_8_0= ruleEBoolean ) ) this_COMMA_9= RULE_COMMA (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )? (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )? (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )? (otherlv_17= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_19= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2227:3: ()
            // InternalC2fDSL.g:2228:4: 
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
            		
            // InternalC2fDSL.g:2246:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:2247:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:2247:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:2248:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_48); 

            			newLeafNode(this_COMMA_5, grammarAccess.getAutocompleteAccess().getCOMMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getAutocompleteAccess().getMultipleKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_24); 

            			newLeafNode(this_COLON_7, grammarAccess.getAutocompleteAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalC2fDSL.g:2277:3: ( (lv_multiple_8_0= ruleEBoolean ) )
            // InternalC2fDSL.g:2278:4: (lv_multiple_8_0= ruleEBoolean )
            {
            // InternalC2fDSL.g:2278:4: (lv_multiple_8_0= ruleEBoolean )
            // InternalC2fDSL.g:2279:5: lv_multiple_8_0= ruleEBoolean
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

            this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_49); 

            			newLeafNode(this_COMMA_9, grammarAccess.getAutocompleteAccess().getCOMMATerminalRuleCall_9());
            		
            // InternalC2fDSL.g:2300:3: (otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalC2fDSL.g:2301:4: otherlv_10= 'displayName' ( (lv_displayName_11_0= ruleEString ) ) this_COMMA_12= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getAutocompleteAccess().getDisplayNameKeyword_10_0());
                    			
                    // InternalC2fDSL.g:2305:4: ( (lv_displayName_11_0= ruleEString ) )
                    // InternalC2fDSL.g:2306:5: (lv_displayName_11_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2306:5: (lv_displayName_11_0= ruleEString )
                    // InternalC2fDSL.g:2307:6: lv_displayName_11_0= ruleEString
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

                    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_50); 

                    				newLeafNode(this_COMMA_12, grammarAccess.getAutocompleteAccess().getCOMMATerminalRuleCall_10_2());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:2329:3: (otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalC2fDSL.g:2330:4: otherlv_13= 'description' ( (lv_description_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getAutocompleteAccess().getDescriptionKeyword_11_0());
                    			
                    // InternalC2fDSL.g:2334:4: ( (lv_description_14_0= ruleEString ) )
                    // InternalC2fDSL.g:2335:5: (lv_description_14_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2335:5: (lv_description_14_0= ruleEString )
                    // InternalC2fDSL.g:2336:6: lv_description_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutocompleteAccess().getDescriptionEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalC2fDSL.g:2354:3: (otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalC2fDSL.g:2355:4: otherlv_15= 'label' ( (lv_label_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getAutocompleteAccess().getLabelKeyword_12_0());
                    			
                    // InternalC2fDSL.g:2359:4: ( (lv_label_16_0= ruleEString ) )
                    // InternalC2fDSL.g:2360:5: (lv_label_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2360:5: (lv_label_16_0= ruleEString )
                    // InternalC2fDSL.g:2361:6: lv_label_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutocompleteAccess().getLabelEStringParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            // InternalC2fDSL.g:2379:3: (otherlv_17= 'property' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalC2fDSL.g:2380:4: otherlv_17= 'property' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getAutocompleteAccess().getPropertyKeyword_13_0());
                    			
                    // InternalC2fDSL.g:2384:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:2385:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:2385:5: ( ruleEString )
                    // InternalC2fDSL.g:2386:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAutocompleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAutocompleteAccess().getPropertyStructuralFeatureCrossReference_13_1_0());
                    					
                    pushFollow(FOLLOW_15);
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
    // InternalC2fDSL.g:2409:1: entryRuleDropdownlist returns [EObject current=null] : iv_ruleDropdownlist= ruleDropdownlist EOF ;
    public final EObject entryRuleDropdownlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropdownlist = null;


        try {
            // InternalC2fDSL.g:2409:53: (iv_ruleDropdownlist= ruleDropdownlist EOF )
            // InternalC2fDSL.g:2410:2: iv_ruleDropdownlist= ruleDropdownlist EOF
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
    // InternalC2fDSL.g:2416:1: ruleDropdownlist returns [EObject current=null] : ( () otherlv_1= 'Dropdownlist' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE ) ;
    public final EObject ruleDropdownlist() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BRACESOPEN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_BRACESCLOSE_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_displayName_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_label_9_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2422:2: ( ( () otherlv_1= 'Dropdownlist' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2423:2: ( () otherlv_1= 'Dropdownlist' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2423:2: ( () otherlv_1= 'Dropdownlist' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2424:3: () otherlv_1= 'Dropdownlist' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2424:3: ()
            // InternalC2fDSL.g:2425:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropdownlistAccess().getDropdownlistAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDropdownlistAccess().getDropdownlistKeyword_1());
            		
            // InternalC2fDSL.g:2435:3: ( (lv_name_2_0= ruleEString ) )
            // InternalC2fDSL.g:2436:4: (lv_name_2_0= ruleEString )
            {
            // InternalC2fDSL.g:2436:4: (lv_name_2_0= ruleEString )
            // InternalC2fDSL.g:2437:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDropdownlistAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropdownlistRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESOPEN_3=(Token)match(input,RULE_BRACESOPEN,FOLLOW_49); 

            			newLeafNode(this_BRACESOPEN_3, grammarAccess.getDropdownlistAccess().getBRACESOPENTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:2458:3: (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalC2fDSL.g:2459:4: otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDropdownlistAccess().getDisplayNameKeyword_4_0());
                    			
                    // InternalC2fDSL.g:2463:4: ( (lv_displayName_5_0= ruleEString ) )
                    // InternalC2fDSL.g:2464:5: (lv_displayName_5_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2464:5: (lv_displayName_5_0= ruleEString )
                    // InternalC2fDSL.g:2465:6: lv_displayName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getDisplayNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_displayName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropdownlistRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_5_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2483:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalC2fDSL.g:2484:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getDropdownlistAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalC2fDSL.g:2488:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalC2fDSL.g:2489:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2489:5: (lv_description_7_0= ruleEString )
                    // InternalC2fDSL.g:2490:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropdownlistRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2508:3: (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalC2fDSL.g:2509:4: otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getDropdownlistAccess().getLabelKeyword_6_0());
                    			
                    // InternalC2fDSL.g:2513:4: ( (lv_label_9_0= ruleEString ) )
                    // InternalC2fDSL.g:2514:5: (lv_label_9_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2514:5: (lv_label_9_0= ruleEString )
                    // InternalC2fDSL.g:2515:6: lv_label_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getLabelEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_label_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropdownlistRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_9_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2533:3: (otherlv_10= 'property' ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalC2fDSL.g:2534:4: otherlv_10= 'property' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getDropdownlistAccess().getPropertyKeyword_7_0());
                    			
                    // InternalC2fDSL.g:2538:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:2539:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:2539:5: ( ruleEString )
                    // InternalC2fDSL.g:2540:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDropdownlistRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDropdownlistAccess().getPropertyStructuralFeatureCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_12=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_12, grammarAccess.getDropdownlistAccess().getBRACESCLOSETerminalRuleCall_8());
            		

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
    // InternalC2fDSL.g:2563:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalC2fDSL.g:2563:46: (iv_ruleImage= ruleImage EOF )
            // InternalC2fDSL.g:2564:2: iv_ruleImage= ruleImage EOF
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
    // InternalC2fDSL.g:2570:1: ruleImage returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'width' ( (lv_width_10_0= ruleEDouble ) ) )? (otherlv_11= 'height' ( (lv_height_12_0= ruleEDouble ) ) )? (otherlv_13= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_15= RULE_BRACESCLOSE ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token this_BRACESCLOSE_15=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_width_10_0 = null;

        AntlrDatatypeRuleToken lv_height_12_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2576:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'width' ( (lv_width_10_0= ruleEDouble ) ) )? (otherlv_11= 'height' ( (lv_height_12_0= ruleEDouble ) ) )? (otherlv_13= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_15= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2577:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'width' ( (lv_width_10_0= ruleEDouble ) ) )? (otherlv_11= 'height' ( (lv_height_12_0= ruleEDouble ) ) )? (otherlv_13= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_15= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2577:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'width' ( (lv_width_10_0= ruleEDouble ) ) )? (otherlv_11= 'height' ( (lv_height_12_0= ruleEDouble ) ) )? (otherlv_13= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_15= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2578:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'image' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'width' ( (lv_width_10_0= ruleEDouble ) ) )? (otherlv_11= 'height' ( (lv_height_12_0= ruleEDouble ) ) )? (otherlv_13= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_15= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2578:3: ()
            // InternalC2fDSL.g:2579:4: 
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
            		
            // InternalC2fDSL.g:2597:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:2598:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:2598:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:2599:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImageAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_54);
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

            // InternalC2fDSL.g:2616:3: (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalC2fDSL.g:2617:4: otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getImageAccess().getDisplayNameKeyword_5_0());
                    			
                    // InternalC2fDSL.g:2621:4: ( (lv_displayName_6_0= ruleEString ) )
                    // InternalC2fDSL.g:2622:5: (lv_displayName_6_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2622:5: (lv_displayName_6_0= ruleEString )
                    // InternalC2fDSL.g:2623:6: lv_displayName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getDisplayNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_displayName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_6_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2641:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalC2fDSL.g:2642:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getImageAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalC2fDSL.g:2646:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalC2fDSL.g:2647:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2647:5: (lv_description_8_0= ruleEString )
                    // InternalC2fDSL.g:2648:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2666:3: (otherlv_9= 'width' ( (lv_width_10_0= ruleEDouble ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalC2fDSL.g:2667:4: otherlv_9= 'width' ( (lv_width_10_0= ruleEDouble ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_57); 

                    				newLeafNode(otherlv_9, grammarAccess.getImageAccess().getWidthKeyword_7_0());
                    			
                    // InternalC2fDSL.g:2671:4: ( (lv_width_10_0= ruleEDouble ) )
                    // InternalC2fDSL.g:2672:5: (lv_width_10_0= ruleEDouble )
                    {
                    // InternalC2fDSL.g:2672:5: (lv_width_10_0= ruleEDouble )
                    // InternalC2fDSL.g:2673:6: lv_width_10_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getWidthEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_width_10_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_10_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2691:3: (otherlv_11= 'height' ( (lv_height_12_0= ruleEDouble ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalC2fDSL.g:2692:4: otherlv_11= 'height' ( (lv_height_12_0= ruleEDouble ) )
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_57); 

                    				newLeafNode(otherlv_11, grammarAccess.getImageAccess().getHeightKeyword_8_0());
                    			
                    // InternalC2fDSL.g:2696:4: ( (lv_height_12_0= ruleEDouble ) )
                    // InternalC2fDSL.g:2697:5: (lv_height_12_0= ruleEDouble )
                    {
                    // InternalC2fDSL.g:2697:5: (lv_height_12_0= ruleEDouble )
                    // InternalC2fDSL.g:2698:6: lv_height_12_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getHeightEDoubleParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_height_12_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2716:3: (otherlv_13= 'property' ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalC2fDSL.g:2717:4: otherlv_13= 'property' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getImageAccess().getPropertyKeyword_9_0());
                    			
                    // InternalC2fDSL.g:2721:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:2722:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:2722:5: ( ruleEString )
                    // InternalC2fDSL.g:2723:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getImageAccess().getPropertyStructuralFeatureCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_15=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_15, grammarAccess.getImageAccess().getBRACESCLOSETerminalRuleCall_10());
            		

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
    // InternalC2fDSL.g:2746:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalC2fDSL.g:2746:45: (iv_ruleList= ruleList EOF )
            // InternalC2fDSL.g:2747:2: iv_ruleList= ruleList EOF
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
    // InternalC2fDSL.g:2753:1: ruleList returns [EObject current=null] : ( () ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'List' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token lv_multiple_1_0=null;
        Token otherlv_2=null;
        Token this_BRACESOPEN_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_BRACESCLOSE_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_displayName_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_label_10_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2759:2: ( ( () ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'List' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2760:2: ( () ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'List' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2760:2: ( () ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'List' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2761:3: () ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'List' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2761:3: ()
            // InternalC2fDSL.g:2762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListAccess().getListAction_0(),
            					current);
            			

            }

            // InternalC2fDSL.g:2768:3: ( (lv_multiple_1_0= 'multiple' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalC2fDSL.g:2769:4: (lv_multiple_1_0= 'multiple' )
                    {
                    // InternalC2fDSL.g:2769:4: (lv_multiple_1_0= 'multiple' )
                    // InternalC2fDSL.g:2770:5: lv_multiple_1_0= 'multiple'
                    {
                    lv_multiple_1_0=(Token)match(input,46,FOLLOW_59); 

                    					newLeafNode(lv_multiple_1_0, grammarAccess.getListAccess().getMultipleMultipleKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getListRule());
                    					}
                    					setWithLastConsumed(current, "multiple", true, "multiple");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getListAccess().getListKeyword_2());
            		
            // InternalC2fDSL.g:2786:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:2787:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:2787:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:2788:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getListAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESOPEN_4=(Token)match(input,RULE_BRACESOPEN,FOLLOW_49); 

            			newLeafNode(this_BRACESOPEN_4, grammarAccess.getListAccess().getBRACESOPENTerminalRuleCall_4());
            		
            // InternalC2fDSL.g:2809:3: (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalC2fDSL.g:2810:4: otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getListAccess().getDisplayNameKeyword_5_0());
                    			
                    // InternalC2fDSL.g:2814:4: ( (lv_displayName_6_0= ruleEString ) )
                    // InternalC2fDSL.g:2815:5: (lv_displayName_6_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2815:5: (lv_displayName_6_0= ruleEString )
                    // InternalC2fDSL.g:2816:6: lv_displayName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getDisplayNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_displayName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_6_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2834:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalC2fDSL.g:2835:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getListAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalC2fDSL.g:2839:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalC2fDSL.g:2840:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2840:5: (lv_description_8_0= ruleEString )
                    // InternalC2fDSL.g:2841:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2859:3: (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalC2fDSL.g:2860:4: otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getListAccess().getLabelKeyword_7_0());
                    			
                    // InternalC2fDSL.g:2864:4: ( (lv_label_10_0= ruleEString ) )
                    // InternalC2fDSL.g:2865:5: (lv_label_10_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2865:5: (lv_label_10_0= ruleEString )
                    // InternalC2fDSL.g:2866:6: lv_label_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getLabelEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_label_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_10_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:2884:3: (otherlv_11= 'property' ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==33) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalC2fDSL.g:2885:4: otherlv_11= 'property' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getListAccess().getPropertyKeyword_8_0());
                    			
                    // InternalC2fDSL.g:2889:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:2890:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:2890:5: ( ruleEString )
                    // InternalC2fDSL.g:2891:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getListRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getListAccess().getPropertyStructuralFeatureCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_13=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_13, grammarAccess.getListAccess().getBRACESCLOSETerminalRuleCall_9());
            		

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
    // InternalC2fDSL.g:2914:1: entryRuleInputText returns [EObject current=null] : iv_ruleInputText= ruleInputText EOF ;
    public final EObject entryRuleInputText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputText = null;


        try {
            // InternalC2fDSL.g:2914:50: (iv_ruleInputText= ruleInputText EOF )
            // InternalC2fDSL.g:2915:2: iv_ruleInputText= ruleInputText EOF
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
    // InternalC2fDSL.g:2921:1: ruleInputText returns [EObject current=null] : ( () ( (lv_multiline_1_0= 'multiline' ) )? otherlv_2= 'InputText' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE ) ;
    public final EObject ruleInputText() throws RecognitionException {
        EObject current = null;

        Token lv_multiline_1_0=null;
        Token otherlv_2=null;
        Token this_BRACESOPEN_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_BRACESCLOSE_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_displayName_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_label_10_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:2927:2: ( ( () ( (lv_multiline_1_0= 'multiline' ) )? otherlv_2= 'InputText' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:2928:2: ( () ( (lv_multiline_1_0= 'multiline' ) )? otherlv_2= 'InputText' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:2928:2: ( () ( (lv_multiline_1_0= 'multiline' ) )? otherlv_2= 'InputText' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:2929:3: () ( (lv_multiline_1_0= 'multiline' ) )? otherlv_2= 'InputText' ( (lv_name_3_0= ruleEString ) ) this_BRACESOPEN_4= RULE_BRACESOPEN (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )? (otherlv_11= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_13= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:2929:3: ()
            // InternalC2fDSL.g:2930:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputTextAccess().getInputTextAction_0(),
            					current);
            			

            }

            // InternalC2fDSL.g:2936:3: ( (lv_multiline_1_0= 'multiline' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==53) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalC2fDSL.g:2937:4: (lv_multiline_1_0= 'multiline' )
                    {
                    // InternalC2fDSL.g:2937:4: (lv_multiline_1_0= 'multiline' )
                    // InternalC2fDSL.g:2938:5: lv_multiline_1_0= 'multiline'
                    {
                    lv_multiline_1_0=(Token)match(input,53,FOLLOW_60); 

                    					newLeafNode(lv_multiline_1_0, grammarAccess.getInputTextAccess().getMultilineMultilineKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputTextRule());
                    					}
                    					setWithLastConsumed(current, "multiline", true, "multiline");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInputTextAccess().getInputTextKeyword_2());
            		
            // InternalC2fDSL.g:2954:3: ( (lv_name_3_0= ruleEString ) )
            // InternalC2fDSL.g:2955:4: (lv_name_3_0= ruleEString )
            {
            // InternalC2fDSL.g:2955:4: (lv_name_3_0= ruleEString )
            // InternalC2fDSL.g:2956:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputTextAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputTextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESOPEN_4=(Token)match(input,RULE_BRACESOPEN,FOLLOW_49); 

            			newLeafNode(this_BRACESOPEN_4, grammarAccess.getInputTextAccess().getBRACESOPENTerminalRuleCall_4());
            		
            // InternalC2fDSL.g:2977:3: (otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalC2fDSL.g:2978:4: otherlv_5= 'displayName' ( (lv_displayName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputTextAccess().getDisplayNameKeyword_5_0());
                    			
                    // InternalC2fDSL.g:2982:4: ( (lv_displayName_6_0= ruleEString ) )
                    // InternalC2fDSL.g:2983:5: (lv_displayName_6_0= ruleEString )
                    {
                    // InternalC2fDSL.g:2983:5: (lv_displayName_6_0= ruleEString )
                    // InternalC2fDSL.g:2984:6: lv_displayName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputTextAccess().getDisplayNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_displayName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputTextRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_6_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3002:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==31) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalC2fDSL.g:3003:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputTextAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalC2fDSL.g:3007:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalC2fDSL.g:3008:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3008:5: (lv_description_8_0= ruleEString )
                    // InternalC2fDSL.g:3009:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputTextAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputTextRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3027:3: (otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalC2fDSL.g:3028:4: otherlv_9= 'label' ( (lv_label_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getInputTextAccess().getLabelKeyword_7_0());
                    			
                    // InternalC2fDSL.g:3032:4: ( (lv_label_10_0= ruleEString ) )
                    // InternalC2fDSL.g:3033:5: (lv_label_10_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3033:5: (lv_label_10_0= ruleEString )
                    // InternalC2fDSL.g:3034:6: lv_label_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputTextAccess().getLabelEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_label_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputTextRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_10_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3052:3: (otherlv_11= 'property' ( ( ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==33) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalC2fDSL.g:3053:4: otherlv_11= 'property' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputTextAccess().getPropertyKeyword_8_0());
                    			
                    // InternalC2fDSL.g:3057:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3058:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3058:5: ( ruleEString )
                    // InternalC2fDSL.g:3059:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputTextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInputTextAccess().getPropertyStructuralFeatureCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_13=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_13, grammarAccess.getInputTextAccess().getBRACESCLOSETerminalRuleCall_9());
            		

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
    // InternalC2fDSL.g:3082:1: entryRuleStaticContainer returns [EObject current=null] : iv_ruleStaticContainer= ruleStaticContainer EOF ;
    public final EObject entryRuleStaticContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticContainer = null;


        try {
            // InternalC2fDSL.g:3082:56: (iv_ruleStaticContainer= ruleStaticContainer EOF )
            // InternalC2fDSL.g:3083:2: iv_ruleStaticContainer= ruleStaticContainer EOF
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
    // InternalC2fDSL.g:3089:1: ruleStaticContainer returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'entity' ( ( ruleEString ) ) )? (otherlv_12= 'elements' this_BRACKETSO_13= RULE_BRACKETSO ( (lv_elements_14_0= ruleElementView ) ) (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )* this_BRACKETSC_17= RULE_BRACKETSC )? this_BRACESCLOSE_18= RULE_BRACESCLOSE ) ;
    public final EObject ruleStaticContainer() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token this_COMMA_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_BRACKETSO_13=null;
        Token this_COMMA_15=null;
        Token this_BRACKETSC_17=null;
        Token this_BRACESCLOSE_18=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_elements_16_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3095:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'entity' ( ( ruleEString ) ) )? (otherlv_12= 'elements' this_BRACKETSO_13= RULE_BRACKETSO ( (lv_elements_14_0= ruleElementView ) ) (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )* this_BRACKETSC_17= RULE_BRACKETSC )? this_BRACESCLOSE_18= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3096:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'entity' ( ( ruleEString ) ) )? (otherlv_12= 'elements' this_BRACKETSO_13= RULE_BRACKETSO ( (lv_elements_14_0= ruleElementView ) ) (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )* this_BRACKETSC_17= RULE_BRACKETSC )? this_BRACESCLOSE_18= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3096:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'entity' ( ( ruleEString ) ) )? (otherlv_12= 'elements' this_BRACKETSO_13= RULE_BRACKETSO ( (lv_elements_14_0= ruleElementView ) ) (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )* this_BRACKETSC_17= RULE_BRACKETSC )? this_BRACESCLOSE_18= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3097:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'name' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'entity' ( ( ruleEString ) ) )? (otherlv_12= 'elements' this_BRACKETSO_13= RULE_BRACKETSO ( (lv_elements_14_0= ruleElementView ) ) (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )* this_BRACKETSC_17= RULE_BRACKETSC )? this_BRACESCLOSE_18= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3097:3: ()
            // InternalC2fDSL.g:3098:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStaticContainerAccess().getStaticContainerAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_3); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getStaticContainerAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStaticContainerAccess().getNameKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getStaticContainerAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3116:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:3117:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:3117:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:3118:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_61); 

            			newLeafNode(this_COMMA_5, grammarAccess.getStaticContainerAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:3139:3: (otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==25) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalC2fDSL.g:3140:4: otherlv_6= 'displayName' ( (lv_displayName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getStaticContainerAccess().getDisplayNameKeyword_6_0());
                    			
                    // InternalC2fDSL.g:3144:4: ( (lv_displayName_7_0= ruleEString ) )
                    // InternalC2fDSL.g:3145:5: (lv_displayName_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3145:5: (lv_displayName_7_0= ruleEString )
                    // InternalC2fDSL.g:3146:6: lv_displayName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getDisplayNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_displayName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaticContainerRule());
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

            // InternalC2fDSL.g:3164:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==31) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalC2fDSL.g:3165:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getStaticContainerAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalC2fDSL.g:3169:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalC2fDSL.g:3170:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3170:5: (lv_description_9_0= ruleEString )
                    // InternalC2fDSL.g:3171:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getDescriptionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaticContainerRule());
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

            // InternalC2fDSL.g:3189:3: (otherlv_10= 'entity' ( ( ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalC2fDSL.g:3190:4: otherlv_10= 'entity' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getStaticContainerAccess().getEntityKeyword_8_0());
                    			
                    // InternalC2fDSL.g:3194:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3195:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3195:5: ( ruleEString )
                    // InternalC2fDSL.g:3196:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStaticContainerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getEntityEntityCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3211:3: (otherlv_12= 'elements' this_BRACKETSO_13= RULE_BRACKETSO ( (lv_elements_14_0= ruleElementView ) ) (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )* this_BRACKETSC_17= RULE_BRACKETSC )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==23) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalC2fDSL.g:3212:4: otherlv_12= 'elements' this_BRACKETSO_13= RULE_BRACKETSO ( (lv_elements_14_0= ruleElementView ) ) (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )* this_BRACKETSC_17= RULE_BRACKETSC
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getStaticContainerAccess().getElementsKeyword_9_0());
                    			
                    this_BRACKETSO_13=(Token)match(input,RULE_BRACKETSO,FOLLOW_65); 

                    				newLeafNode(this_BRACKETSO_13, grammarAccess.getStaticContainerAccess().getBRACKETSOTerminalRuleCall_9_1());
                    			
                    // InternalC2fDSL.g:3220:4: ( (lv_elements_14_0= ruleElementView ) )
                    // InternalC2fDSL.g:3221:5: (lv_elements_14_0= ruleElementView )
                    {
                    // InternalC2fDSL.g:3221:5: (lv_elements_14_0= ruleElementView )
                    // InternalC2fDSL.g:3222:6: lv_elements_14_0= ruleElementView
                    {

                    						newCompositeNode(grammarAccess.getStaticContainerAccess().getElementsElementViewParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elements_14_0=ruleElementView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStaticContainerRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_14_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC2fDSL.g:3239:4: (this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_COMMA) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalC2fDSL.g:3240:5: this_COMMA_15= RULE_COMMA ( (lv_elements_16_0= ruleElementView ) )
                    	    {
                    	    this_COMMA_15=(Token)match(input,RULE_COMMA,FOLLOW_65); 

                    	    					newLeafNode(this_COMMA_15, grammarAccess.getStaticContainerAccess().getCOMMATerminalRuleCall_9_3_0());
                    	    				
                    	    // InternalC2fDSL.g:3244:5: ( (lv_elements_16_0= ruleElementView ) )
                    	    // InternalC2fDSL.g:3245:6: (lv_elements_16_0= ruleElementView )
                    	    {
                    	    // InternalC2fDSL.g:3245:6: (lv_elements_16_0= ruleElementView )
                    	    // InternalC2fDSL.g:3246:7: lv_elements_16_0= ruleElementView
                    	    {

                    	    							newCompositeNode(grammarAccess.getStaticContainerAccess().getElementsElementViewParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elements_16_0=ruleElementView();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStaticContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_16_0,
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

                    this_BRACKETSC_17=(Token)match(input,RULE_BRACKETSC,FOLLOW_15); 

                    				newLeafNode(this_BRACKETSC_17, grammarAccess.getStaticContainerAccess().getBRACKETSCTerminalRuleCall_9_4());
                    			

                    }
                    break;

            }

            this_BRACESCLOSE_18=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_18, grammarAccess.getStaticContainerAccess().getBRACESCLOSETerminalRuleCall_10());
            		

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
    // InternalC2fDSL.g:3277:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // InternalC2fDSL.g:3277:49: (iv_ruleTextArea= ruleTextArea EOF )
            // InternalC2fDSL.g:3278:2: iv_ruleTextArea= ruleTextArea EOF
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
    // InternalC2fDSL.g:3284:1: ruleTextArea returns [EObject current=null] : ( () otherlv_1= 'TextArea' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BRACESOPEN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_BRACESCLOSE_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_displayName_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3290:2: ( ( () otherlv_1= 'TextArea' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3291:2: ( () otherlv_1= 'TextArea' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3291:2: ( () otherlv_1= 'TextArea' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3292:3: () otherlv_1= 'TextArea' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3292:3: ()
            // InternalC2fDSL.g:3293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextAreaAccess().getTextAreaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAreaAccess().getTextAreaKeyword_1());
            		
            // InternalC2fDSL.g:3303:3: ( (lv_name_2_0= ruleEString ) )
            // InternalC2fDSL.g:3304:4: (lv_name_2_0= ruleEString )
            {
            // InternalC2fDSL.g:3304:4: (lv_name_2_0= ruleEString )
            // InternalC2fDSL.g:3305:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAreaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextAreaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESOPEN_3=(Token)match(input,RULE_BRACESOPEN,FOLLOW_66); 

            			newLeafNode(this_BRACESOPEN_3, grammarAccess.getTextAreaAccess().getBRACESOPENTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3326:3: (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==25) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalC2fDSL.g:3327:4: otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAreaAccess().getDisplayNameKeyword_4_0());
                    			
                    // InternalC2fDSL.g:3331:4: ( (lv_displayName_5_0= ruleEString ) )
                    // InternalC2fDSL.g:3332:5: (lv_displayName_5_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3332:5: (lv_displayName_5_0= ruleEString )
                    // InternalC2fDSL.g:3333:6: lv_displayName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getDisplayNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_displayName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_5_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3351:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==31) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalC2fDSL.g:3352:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextAreaAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalC2fDSL.g:3356:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalC2fDSL.g:3357:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3357:5: (lv_description_7_0= ruleEString )
                    // InternalC2fDSL.g:3358:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3376:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==39) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalC2fDSL.g:3377:4: otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextAreaAccess().getValueKeyword_6_0());
                    			
                    // InternalC2fDSL.g:3381:4: ( (lv_value_9_0= ruleEString ) )
                    // InternalC2fDSL.g:3382:5: (lv_value_9_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3382:5: (lv_value_9_0= ruleEString )
                    // InternalC2fDSL.g:3383:6: lv_value_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_value_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3401:3: (otherlv_10= 'property' ( ( ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==33) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalC2fDSL.g:3402:4: otherlv_10= 'property' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextAreaAccess().getPropertyKeyword_7_0());
                    			
                    // InternalC2fDSL.g:3406:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3407:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3407:5: ( ruleEString )
                    // InternalC2fDSL.g:3408:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextAreaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getPropertyStructuralFeatureCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_12=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_12, grammarAccess.getTextAreaAccess().getBRACESCLOSETerminalRuleCall_8());
            		

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
    // InternalC2fDSL.g:3431:1: entryRuleIterationContainer returns [EObject current=null] : iv_ruleIterationContainer= ruleIterationContainer EOF ;
    public final EObject entryRuleIterationContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationContainer = null;


        try {
            // InternalC2fDSL.g:3431:59: (iv_ruleIterationContainer= ruleIterationContainer EOF )
            // InternalC2fDSL.g:3432:2: iv_ruleIterationContainer= ruleIterationContainer EOF
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
    // InternalC2fDSL.g:3438:1: ruleIterationContainer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) this_BRACESOPEN_2= RULE_BRACESOPEN otherlv_3= 'containerType' this_COLON_4= RULE_COLON otherlv_5= 'iteration' this_COMMA_6= RULE_COMMA (otherlv_7= 'displayName' this_COLON_8= RULE_COLON ( (lv_displayName_9_0= ruleEString ) ) )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) )? (otherlv_13= 'entity' this_COLON_14= RULE_COLON ( ( ruleEString ) ) )? (otherlv_16= 'elements' this_BRACESOPEN_17= RULE_BRACESOPEN ( (lv_elements_18_0= ruleElementView ) ) (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )* this_BRACESCLOSE_21= RULE_BRACESCLOSE )? (otherlv_22= 'iterationFilters' this_BRACESOPEN_23= RULE_BRACESOPEN ( (lv_iterationFilters_24_0= ruleIterationFilter ) ) (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )* this_BRACESCLOSE_27= RULE_BRACESCLOSE )? this_BRACESCLOSE_28= RULE_BRACESCLOSE ) ;
    public final EObject ruleIterationContainer() throws RecognitionException {
        EObject current = null;

        Token this_BRACESOPEN_2=null;
        Token otherlv_3=null;
        Token this_COLON_4=null;
        Token otherlv_5=null;
        Token this_COMMA_6=null;
        Token otherlv_7=null;
        Token this_COLON_8=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token otherlv_13=null;
        Token this_COLON_14=null;
        Token otherlv_16=null;
        Token this_BRACESOPEN_17=null;
        Token this_COMMA_19=null;
        Token this_BRACESCLOSE_21=null;
        Token otherlv_22=null;
        Token this_BRACESOPEN_23=null;
        Token this_COMMA_25=null;
        Token this_BRACESCLOSE_27=null;
        Token this_BRACESCLOSE_28=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_displayName_9_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        EObject lv_elements_18_0 = null;

        EObject lv_elements_20_0 = null;

        EObject lv_iterationFilters_24_0 = null;

        EObject lv_iterationFilters_26_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3444:2: ( ( () ( (lv_name_1_0= ruleEString ) ) this_BRACESOPEN_2= RULE_BRACESOPEN otherlv_3= 'containerType' this_COLON_4= RULE_COLON otherlv_5= 'iteration' this_COMMA_6= RULE_COMMA (otherlv_7= 'displayName' this_COLON_8= RULE_COLON ( (lv_displayName_9_0= ruleEString ) ) )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) )? (otherlv_13= 'entity' this_COLON_14= RULE_COLON ( ( ruleEString ) ) )? (otherlv_16= 'elements' this_BRACESOPEN_17= RULE_BRACESOPEN ( (lv_elements_18_0= ruleElementView ) ) (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )* this_BRACESCLOSE_21= RULE_BRACESCLOSE )? (otherlv_22= 'iterationFilters' this_BRACESOPEN_23= RULE_BRACESOPEN ( (lv_iterationFilters_24_0= ruleIterationFilter ) ) (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )* this_BRACESCLOSE_27= RULE_BRACESCLOSE )? this_BRACESCLOSE_28= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3445:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BRACESOPEN_2= RULE_BRACESOPEN otherlv_3= 'containerType' this_COLON_4= RULE_COLON otherlv_5= 'iteration' this_COMMA_6= RULE_COMMA (otherlv_7= 'displayName' this_COLON_8= RULE_COLON ( (lv_displayName_9_0= ruleEString ) ) )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) )? (otherlv_13= 'entity' this_COLON_14= RULE_COLON ( ( ruleEString ) ) )? (otherlv_16= 'elements' this_BRACESOPEN_17= RULE_BRACESOPEN ( (lv_elements_18_0= ruleElementView ) ) (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )* this_BRACESCLOSE_21= RULE_BRACESCLOSE )? (otherlv_22= 'iterationFilters' this_BRACESOPEN_23= RULE_BRACESOPEN ( (lv_iterationFilters_24_0= ruleIterationFilter ) ) (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )* this_BRACESCLOSE_27= RULE_BRACESCLOSE )? this_BRACESCLOSE_28= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3445:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BRACESOPEN_2= RULE_BRACESOPEN otherlv_3= 'containerType' this_COLON_4= RULE_COLON otherlv_5= 'iteration' this_COMMA_6= RULE_COMMA (otherlv_7= 'displayName' this_COLON_8= RULE_COLON ( (lv_displayName_9_0= ruleEString ) ) )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) )? (otherlv_13= 'entity' this_COLON_14= RULE_COLON ( ( ruleEString ) ) )? (otherlv_16= 'elements' this_BRACESOPEN_17= RULE_BRACESOPEN ( (lv_elements_18_0= ruleElementView ) ) (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )* this_BRACESCLOSE_21= RULE_BRACESCLOSE )? (otherlv_22= 'iterationFilters' this_BRACESOPEN_23= RULE_BRACESOPEN ( (lv_iterationFilters_24_0= ruleIterationFilter ) ) (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )* this_BRACESCLOSE_27= RULE_BRACESCLOSE )? this_BRACESCLOSE_28= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3446:3: () ( (lv_name_1_0= ruleEString ) ) this_BRACESOPEN_2= RULE_BRACESOPEN otherlv_3= 'containerType' this_COLON_4= RULE_COLON otherlv_5= 'iteration' this_COMMA_6= RULE_COMMA (otherlv_7= 'displayName' this_COLON_8= RULE_COLON ( (lv_displayName_9_0= ruleEString ) ) )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) )? (otherlv_13= 'entity' this_COLON_14= RULE_COLON ( ( ruleEString ) ) )? (otherlv_16= 'elements' this_BRACESOPEN_17= RULE_BRACESOPEN ( (lv_elements_18_0= ruleElementView ) ) (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )* this_BRACESCLOSE_21= RULE_BRACESCLOSE )? (otherlv_22= 'iterationFilters' this_BRACESOPEN_23= RULE_BRACESOPEN ( (lv_iterationFilters_24_0= ruleIterationFilter ) ) (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )* this_BRACESCLOSE_27= RULE_BRACESCLOSE )? this_BRACESCLOSE_28= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3446:3: ()
            // InternalC2fDSL.g:3447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIterationContainerAccess().getIterationContainerAction_0(),
            					current);
            			

            }

            // InternalC2fDSL.g:3453:3: ( (lv_name_1_0= ruleEString ) )
            // InternalC2fDSL.g:3454:4: (lv_name_1_0= ruleEString )
            {
            // InternalC2fDSL.g:3454:4: (lv_name_1_0= ruleEString )
            // InternalC2fDSL.g:3455:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIterationContainerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterationContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESOPEN_2=(Token)match(input,RULE_BRACESOPEN,FOLLOW_69); 

            			newLeafNode(this_BRACESOPEN_2, grammarAccess.getIterationContainerAccess().getBRACESOPENTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIterationContainerAccess().getContainerTypeKeyword_3());
            		
            this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_70); 

            			newLeafNode(this_COLON_4, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getIterationContainerAccess().getIterationKeyword_5());
            		
            this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_71); 

            			newLeafNode(this_COMMA_6, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_6());
            		
            // InternalC2fDSL.g:3492:3: (otherlv_7= 'displayName' this_COLON_8= RULE_COLON ( (lv_displayName_9_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==25) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalC2fDSL.g:3493:4: otherlv_7= 'displayName' this_COLON_8= RULE_COLON ( (lv_displayName_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getIterationContainerAccess().getDisplayNameKeyword_7_0());
                    			
                    this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_8, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:3501:4: ( (lv_displayName_9_0= ruleEString ) )
                    // InternalC2fDSL.g:3502:5: (lv_displayName_9_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3502:5: (lv_displayName_9_0= ruleEString )
                    // InternalC2fDSL.g:3503:6: lv_displayName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getDisplayNameEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_displayName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_9_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3521:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==31) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalC2fDSL.g:3522:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getIterationContainerAccess().getDescriptionKeyword_8_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:3530:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:3531:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3531:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:3532:6: lv_description_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getDescriptionEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_73);
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


                    }
                    break;

            }

            // InternalC2fDSL.g:3550:3: (otherlv_13= 'entity' this_COLON_14= RULE_COLON ( ( ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==55) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalC2fDSL.g:3551:4: otherlv_13= 'entity' this_COLON_14= RULE_COLON ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getIterationContainerAccess().getEntityKeyword_9_0());
                    			
                    this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_14, grammarAccess.getIterationContainerAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    // InternalC2fDSL.g:3559:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3560:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3560:5: ( ruleEString )
                    // InternalC2fDSL.g:3561:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIterationContainerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getEntityEntityCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_74);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3576:3: (otherlv_16= 'elements' this_BRACESOPEN_17= RULE_BRACESOPEN ( (lv_elements_18_0= ruleElementView ) ) (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )* this_BRACESCLOSE_21= RULE_BRACESCLOSE )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==23) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalC2fDSL.g:3577:4: otherlv_16= 'elements' this_BRACESOPEN_17= RULE_BRACESOPEN ( (lv_elements_18_0= ruleElementView ) ) (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )* this_BRACESCLOSE_21= RULE_BRACESCLOSE
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getIterationContainerAccess().getElementsKeyword_10_0());
                    			
                    this_BRACESOPEN_17=(Token)match(input,RULE_BRACESOPEN,FOLLOW_65); 

                    				newLeafNode(this_BRACESOPEN_17, grammarAccess.getIterationContainerAccess().getBRACESOPENTerminalRuleCall_10_1());
                    			
                    // InternalC2fDSL.g:3585:4: ( (lv_elements_18_0= ruleElementView ) )
                    // InternalC2fDSL.g:3586:5: (lv_elements_18_0= ruleElementView )
                    {
                    // InternalC2fDSL.g:3586:5: (lv_elements_18_0= ruleElementView )
                    // InternalC2fDSL.g:3587:6: lv_elements_18_0= ruleElementView
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getElementsElementViewParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_elements_18_0=ruleElementView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_18_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC2fDSL.g:3604:4: (this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_COMMA) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalC2fDSL.g:3605:5: this_COMMA_19= RULE_COMMA ( (lv_elements_20_0= ruleElementView ) )
                    	    {
                    	    this_COMMA_19=(Token)match(input,RULE_COMMA,FOLLOW_65); 

                    	    					newLeafNode(this_COMMA_19, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_10_3_0());
                    	    				
                    	    // InternalC2fDSL.g:3609:5: ( (lv_elements_20_0= ruleElementView ) )
                    	    // InternalC2fDSL.g:3610:6: (lv_elements_20_0= ruleElementView )
                    	    {
                    	    // InternalC2fDSL.g:3610:6: (lv_elements_20_0= ruleElementView )
                    	    // InternalC2fDSL.g:3611:7: lv_elements_20_0= ruleElementView
                    	    {

                    	    							newCompositeNode(grammarAccess.getIterationContainerAccess().getElementsElementViewParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_75);
                    	    lv_elements_20_0=ruleElementView();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_20_0,
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

                    this_BRACESCLOSE_21=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_76); 

                    				newLeafNode(this_BRACESCLOSE_21, grammarAccess.getIterationContainerAccess().getBRACESCLOSETerminalRuleCall_10_4());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:3634:3: (otherlv_22= 'iterationFilters' this_BRACESOPEN_23= RULE_BRACESOPEN ( (lv_iterationFilters_24_0= ruleIterationFilter ) ) (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )* this_BRACESCLOSE_27= RULE_BRACESCLOSE )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalC2fDSL.g:3635:4: otherlv_22= 'iterationFilters' this_BRACESOPEN_23= RULE_BRACESOPEN ( (lv_iterationFilters_24_0= ruleIterationFilter ) ) (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )* this_BRACESCLOSE_27= RULE_BRACESCLOSE
                    {
                    otherlv_22=(Token)match(input,59,FOLLOW_8); 

                    				newLeafNode(otherlv_22, grammarAccess.getIterationContainerAccess().getIterationFiltersKeyword_11_0());
                    			
                    this_BRACESOPEN_23=(Token)match(input,RULE_BRACESOPEN,FOLLOW_77); 

                    				newLeafNode(this_BRACESOPEN_23, grammarAccess.getIterationContainerAccess().getBRACESOPENTerminalRuleCall_11_1());
                    			
                    // InternalC2fDSL.g:3643:4: ( (lv_iterationFilters_24_0= ruleIterationFilter ) )
                    // InternalC2fDSL.g:3644:5: (lv_iterationFilters_24_0= ruleIterationFilter )
                    {
                    // InternalC2fDSL.g:3644:5: (lv_iterationFilters_24_0= ruleIterationFilter )
                    // InternalC2fDSL.g:3645:6: lv_iterationFilters_24_0= ruleIterationFilter
                    {

                    						newCompositeNode(grammarAccess.getIterationContainerAccess().getIterationFiltersIterationFilterParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_iterationFilters_24_0=ruleIterationFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    						}
                    						add(
                    							current,
                    							"iterationFilters",
                    							lv_iterationFilters_24_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.IterationFilter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC2fDSL.g:3662:4: (this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_COMMA) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalC2fDSL.g:3663:5: this_COMMA_25= RULE_COMMA ( (lv_iterationFilters_26_0= ruleIterationFilter ) )
                    	    {
                    	    this_COMMA_25=(Token)match(input,RULE_COMMA,FOLLOW_77); 

                    	    					newLeafNode(this_COMMA_25, grammarAccess.getIterationContainerAccess().getCOMMATerminalRuleCall_11_3_0());
                    	    				
                    	    // InternalC2fDSL.g:3667:5: ( (lv_iterationFilters_26_0= ruleIterationFilter ) )
                    	    // InternalC2fDSL.g:3668:6: (lv_iterationFilters_26_0= ruleIterationFilter )
                    	    {
                    	    // InternalC2fDSL.g:3668:6: (lv_iterationFilters_26_0= ruleIterationFilter )
                    	    // InternalC2fDSL.g:3669:7: lv_iterationFilters_26_0= ruleIterationFilter
                    	    {

                    	    							newCompositeNode(grammarAccess.getIterationContainerAccess().getIterationFiltersIterationFilterParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_75);
                    	    lv_iterationFilters_26_0=ruleIterationFilter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIterationContainerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"iterationFilters",
                    	    								lv_iterationFilters_26_0,
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

                    this_BRACESCLOSE_27=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_15); 

                    				newLeafNode(this_BRACESCLOSE_27, grammarAccess.getIterationContainerAccess().getBRACESCLOSETerminalRuleCall_11_4());
                    			

                    }
                    break;

            }

            this_BRACESCLOSE_28=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_28, grammarAccess.getIterationContainerAccess().getBRACESCLOSETerminalRuleCall_12());
            		

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
    // InternalC2fDSL.g:3700:1: entryRuleInputForm returns [EObject current=null] : iv_ruleInputForm= ruleInputForm EOF ;
    public final EObject entryRuleInputForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputForm = null;


        try {
            // InternalC2fDSL.g:3700:50: (iv_ruleInputForm= ruleInputForm EOF )
            // InternalC2fDSL.g:3701:2: iv_ruleInputForm= ruleInputForm EOF
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
    // InternalC2fDSL.g:3707:1: ruleInputForm returns [EObject current=null] : ( () otherlv_1= 'InputForm' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'entity' ( ( ruleEString ) ) )? (otherlv_10= 'elements' this_BRACESOPEN_11= RULE_BRACESOPEN ( (lv_elements_12_0= ruleElementView ) ) (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )* this_BRACESCLOSE_15= RULE_BRACESCLOSE )? this_BRACESCLOSE_16= RULE_BRACESCLOSE ) ;
    public final EObject ruleInputForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BRACESOPEN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_BRACESOPEN_11=null;
        Token this_COMMA_13=null;
        Token this_BRACESCLOSE_15=null;
        Token this_BRACESCLOSE_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_displayName_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_elements_12_0 = null;

        EObject lv_elements_14_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3713:2: ( ( () otherlv_1= 'InputForm' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'entity' ( ( ruleEString ) ) )? (otherlv_10= 'elements' this_BRACESOPEN_11= RULE_BRACESOPEN ( (lv_elements_12_0= ruleElementView ) ) (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )* this_BRACESCLOSE_15= RULE_BRACESCLOSE )? this_BRACESCLOSE_16= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3714:2: ( () otherlv_1= 'InputForm' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'entity' ( ( ruleEString ) ) )? (otherlv_10= 'elements' this_BRACESOPEN_11= RULE_BRACESOPEN ( (lv_elements_12_0= ruleElementView ) ) (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )* this_BRACESCLOSE_15= RULE_BRACESCLOSE )? this_BRACESCLOSE_16= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3714:2: ( () otherlv_1= 'InputForm' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'entity' ( ( ruleEString ) ) )? (otherlv_10= 'elements' this_BRACESOPEN_11= RULE_BRACESOPEN ( (lv_elements_12_0= ruleElementView ) ) (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )* this_BRACESCLOSE_15= RULE_BRACESCLOSE )? this_BRACESCLOSE_16= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3715:3: () otherlv_1= 'InputForm' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'entity' ( ( ruleEString ) ) )? (otherlv_10= 'elements' this_BRACESOPEN_11= RULE_BRACESOPEN ( (lv_elements_12_0= ruleElementView ) ) (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )* this_BRACESCLOSE_15= RULE_BRACESCLOSE )? this_BRACESCLOSE_16= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3715:3: ()
            // InternalC2fDSL.g:3716:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputFormAccess().getInputFormAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInputFormAccess().getInputFormKeyword_1());
            		
            // InternalC2fDSL.g:3726:3: ( (lv_name_2_0= ruleEString ) )
            // InternalC2fDSL.g:3727:4: (lv_name_2_0= ruleEString )
            {
            // InternalC2fDSL.g:3727:4: (lv_name_2_0= ruleEString )
            // InternalC2fDSL.g:3728:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputFormAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputFormRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESOPEN_3=(Token)match(input,RULE_BRACESOPEN,FOLLOW_61); 

            			newLeafNode(this_BRACESOPEN_3, grammarAccess.getInputFormAccess().getBRACESOPENTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3749:3: (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalC2fDSL.g:3750:4: otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getInputFormAccess().getDisplayNameKeyword_4_0());
                    			
                    // InternalC2fDSL.g:3754:4: ( (lv_displayName_5_0= ruleEString ) )
                    // InternalC2fDSL.g:3755:5: (lv_displayName_5_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3755:5: (lv_displayName_5_0= ruleEString )
                    // InternalC2fDSL.g:3756:6: lv_displayName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputFormAccess().getDisplayNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_displayName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputFormRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_5_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3774:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==31) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalC2fDSL.g:3775:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputFormAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalC2fDSL.g:3779:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalC2fDSL.g:3780:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3780:5: (lv_description_7_0= ruleEString )
                    // InternalC2fDSL.g:3781:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputFormAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputFormRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3799:3: (otherlv_8= 'entity' ( ( ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==55) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalC2fDSL.g:3800:4: otherlv_8= 'entity' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getInputFormAccess().getEntityKeyword_6_0());
                    			
                    // InternalC2fDSL.g:3804:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:3805:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:3805:5: ( ruleEString )
                    // InternalC2fDSL.g:3806:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputFormRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInputFormAccess().getEntityEntityCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3821:3: (otherlv_10= 'elements' this_BRACESOPEN_11= RULE_BRACESOPEN ( (lv_elements_12_0= ruleElementView ) ) (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )* this_BRACESCLOSE_15= RULE_BRACESCLOSE )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==23) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalC2fDSL.g:3822:4: otherlv_10= 'elements' this_BRACESOPEN_11= RULE_BRACESOPEN ( (lv_elements_12_0= ruleElementView ) ) (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )* this_BRACESCLOSE_15= RULE_BRACESCLOSE
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputFormAccess().getElementsKeyword_7_0());
                    			
                    this_BRACESOPEN_11=(Token)match(input,RULE_BRACESOPEN,FOLLOW_65); 

                    				newLeafNode(this_BRACESOPEN_11, grammarAccess.getInputFormAccess().getBRACESOPENTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:3830:4: ( (lv_elements_12_0= ruleElementView ) )
                    // InternalC2fDSL.g:3831:5: (lv_elements_12_0= ruleElementView )
                    {
                    // InternalC2fDSL.g:3831:5: (lv_elements_12_0= ruleElementView )
                    // InternalC2fDSL.g:3832:6: lv_elements_12_0= ruleElementView
                    {

                    						newCompositeNode(grammarAccess.getInputFormAccess().getElementsElementViewParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_elements_12_0=ruleElementView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputFormRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_12_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalC2fDSL.g:3849:4: (this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==RULE_COMMA) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalC2fDSL.g:3850:5: this_COMMA_13= RULE_COMMA ( (lv_elements_14_0= ruleElementView ) )
                    	    {
                    	    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_65); 

                    	    					newLeafNode(this_COMMA_13, grammarAccess.getInputFormAccess().getCOMMATerminalRuleCall_7_3_0());
                    	    				
                    	    // InternalC2fDSL.g:3854:5: ( (lv_elements_14_0= ruleElementView ) )
                    	    // InternalC2fDSL.g:3855:6: (lv_elements_14_0= ruleElementView )
                    	    {
                    	    // InternalC2fDSL.g:3855:6: (lv_elements_14_0= ruleElementView )
                    	    // InternalC2fDSL.g:3856:7: lv_elements_14_0= ruleElementView
                    	    {

                    	    							newCompositeNode(grammarAccess.getInputFormAccess().getElementsElementViewParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_75);
                    	    lv_elements_14_0=ruleElementView();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInputFormRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_14_0,
                    	    								"co.classlayout2frontend.c2fdsl.C2fDSL.ElementView");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    this_BRACESCLOSE_15=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_15); 

                    				newLeafNode(this_BRACESCLOSE_15, grammarAccess.getInputFormAccess().getBRACESCLOSETerminalRuleCall_7_4());
                    			

                    }
                    break;

            }

            this_BRACESCLOSE_16=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_16, grammarAccess.getInputFormAccess().getBRACESCLOSETerminalRuleCall_8());
            		

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
    // InternalC2fDSL.g:3887:1: entryRuleCheckList returns [EObject current=null] : iv_ruleCheckList= ruleCheckList EOF ;
    public final EObject entryRuleCheckList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckList = null;


        try {
            // InternalC2fDSL.g:3887:50: (iv_ruleCheckList= ruleCheckList EOF )
            // InternalC2fDSL.g:3888:2: iv_ruleCheckList= ruleCheckList EOF
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
    // InternalC2fDSL.g:3894:1: ruleCheckList returns [EObject current=null] : ( () otherlv_1= 'CheckList' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE ) ;
    public final EObject ruleCheckList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BRACESOPEN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_BRACESCLOSE_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_displayName_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_label_9_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:3900:2: ( ( () otherlv_1= 'CheckList' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:3901:2: ( () otherlv_1= 'CheckList' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:3901:2: ( () otherlv_1= 'CheckList' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:3902:3: () otherlv_1= 'CheckList' ( (lv_name_2_0= ruleEString ) ) this_BRACESOPEN_3= RULE_BRACESOPEN (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )? (otherlv_10= 'property' ( ( ruleEString ) ) )? this_BRACESCLOSE_12= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:3902:3: ()
            // InternalC2fDSL.g:3903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckListAccess().getCheckListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckListAccess().getCheckListKeyword_1());
            		
            // InternalC2fDSL.g:3913:3: ( (lv_name_2_0= ruleEString ) )
            // InternalC2fDSL.g:3914:4: (lv_name_2_0= ruleEString )
            {
            // InternalC2fDSL.g:3914:4: (lv_name_2_0= ruleEString )
            // InternalC2fDSL.g:3915:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCheckListAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckListRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESOPEN_3=(Token)match(input,RULE_BRACESOPEN,FOLLOW_49); 

            			newLeafNode(this_BRACESOPEN_3, grammarAccess.getCheckListAccess().getBRACESOPENTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:3936:3: (otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==25) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalC2fDSL.g:3937:4: otherlv_4= 'displayName' ( (lv_displayName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getCheckListAccess().getDisplayNameKeyword_4_0());
                    			
                    // InternalC2fDSL.g:3941:4: ( (lv_displayName_5_0= ruleEString ) )
                    // InternalC2fDSL.g:3942:5: (lv_displayName_5_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3942:5: (lv_displayName_5_0= ruleEString )
                    // InternalC2fDSL.g:3943:6: lv_displayName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckListAccess().getDisplayNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_displayName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckListRule());
                    						}
                    						set(
                    							current,
                    							"displayName",
                    							lv_displayName_5_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3961:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==31) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalC2fDSL.g:3962:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getCheckListAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalC2fDSL.g:3966:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalC2fDSL.g:3967:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3967:5: (lv_description_7_0= ruleEString )
                    // InternalC2fDSL.g:3968:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckListAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckListRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:3986:3: (otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==47) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalC2fDSL.g:3987:4: otherlv_8= 'label' ( (lv_label_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getCheckListAccess().getLabelKeyword_6_0());
                    			
                    // InternalC2fDSL.g:3991:4: ( (lv_label_9_0= ruleEString ) )
                    // InternalC2fDSL.g:3992:5: (lv_label_9_0= ruleEString )
                    {
                    // InternalC2fDSL.g:3992:5: (lv_label_9_0= ruleEString )
                    // InternalC2fDSL.g:3993:6: lv_label_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckListAccess().getLabelEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_label_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckListRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_9_0,
                    							"co.classlayout2frontend.c2fdsl.C2fDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalC2fDSL.g:4011:3: (otherlv_10= 'property' ( ( ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==33) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalC2fDSL.g:4012:4: otherlv_10= 'property' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getCheckListAccess().getPropertyKeyword_7_0());
                    			
                    // InternalC2fDSL.g:4016:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:4017:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:4017:5: ( ruleEString )
                    // InternalC2fDSL.g:4018:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheckListRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCheckListAccess().getPropertyStructuralFeatureCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_12=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_12, grammarAccess.getCheckListAccess().getBRACESCLOSETerminalRuleCall_8());
            		

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
    // InternalC2fDSL.g:4041:1: entryRuleRadioButtonGroup returns [EObject current=null] : iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF ;
    public final EObject entryRuleRadioButtonGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButtonGroup = null;


        try {
            // InternalC2fDSL.g:4041:57: (iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF )
            // InternalC2fDSL.g:4042:2: iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF
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
    // InternalC2fDSL.g:4048:1: ruleRadioButtonGroup returns [EObject current=null] : ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE ) ;
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
        Token this_BRACESCLOSE_20=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_displayName_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_label_16_0 = null;



        	enterRule();

        try {
            // InternalC2fDSL.g:4054:2: ( ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:4055:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:4055:2: ( () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:4056:3: () this_BRACESOPEN_1= RULE_BRACESOPEN otherlv_2= 'radio' this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleEString ) ) this_COMMA_5= RULE_COMMA (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )? (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )? (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )? otherlv_18= 'property' ( ( ruleEString ) ) this_BRACESCLOSE_20= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:4056:3: ()
            // InternalC2fDSL.g:4057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRadioButtonGroupAccess().getRadioButtonGroupAction_0(),
            					current);
            			

            }

            this_BRACESOPEN_1=(Token)match(input,RULE_BRACESOPEN,FOLLOW_78); 

            			newLeafNode(this_BRACESOPEN_1, grammarAccess.getRadioButtonGroupAccess().getBRACESOPENTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRadioButtonGroupAccess().getRadioKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_5); 

            			newLeafNode(this_COLON_3, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:4075:3: ( (lv_name_4_0= ruleEString ) )
            // InternalC2fDSL.g:4076:4: (lv_name_4_0= ruleEString )
            {
            // InternalC2fDSL.g:4076:4: (lv_name_4_0= ruleEString )
            // InternalC2fDSL.g:4077:5: lv_name_4_0= ruleEString
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

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_79); 

            			newLeafNode(this_COMMA_5, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_5());
            		
            // InternalC2fDSL.g:4098:3: (otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==25) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalC2fDSL.g:4099:4: otherlv_6= 'displayName' this_COLON_7= RULE_COLON ( (lv_displayName_8_0= ruleEString ) ) this_COMMA_9= RULE_COMMA
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRadioButtonGroupAccess().getDisplayNameKeyword_6_0());
                    			
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_7, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_6_1());
                    			
                    // InternalC2fDSL.g:4107:4: ( (lv_displayName_8_0= ruleEString ) )
                    // InternalC2fDSL.g:4108:5: (lv_displayName_8_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4108:5: (lv_displayName_8_0= ruleEString )
                    // InternalC2fDSL.g:4109:6: lv_displayName_8_0= ruleEString
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

                    this_COMMA_9=(Token)match(input,RULE_COMMA,FOLLOW_80); 

                    				newLeafNode(this_COMMA_9, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:4131:3: (otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==31) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalC2fDSL.g:4132:4: otherlv_10= 'description' this_COLON_11= RULE_COLON ( (lv_description_12_0= ruleEString ) ) this_COMMA_13= RULE_COMMA
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getRadioButtonGroupAccess().getDescriptionKeyword_7_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_11, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalC2fDSL.g:4140:4: ( (lv_description_12_0= ruleEString ) )
                    // InternalC2fDSL.g:4141:5: (lv_description_12_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4141:5: (lv_description_12_0= ruleEString )
                    // InternalC2fDSL.g:4142:6: lv_description_12_0= ruleEString
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

                    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_81); 

                    				newLeafNode(this_COMMA_13, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:4164:3: (otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==47) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalC2fDSL.g:4165:4: otherlv_14= 'label' this_COLON_15= RULE_COLON ( (lv_label_16_0= ruleEString ) ) this_COMMA_17= RULE_COMMA
                    {
                    otherlv_14=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getRadioButtonGroupAccess().getLabelKeyword_8_0());
                    			
                    this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_5); 

                    				newLeafNode(this_COLON_15, grammarAccess.getRadioButtonGroupAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalC2fDSL.g:4173:4: ( (lv_label_16_0= ruleEString ) )
                    // InternalC2fDSL.g:4174:5: (lv_label_16_0= ruleEString )
                    {
                    // InternalC2fDSL.g:4174:5: (lv_label_16_0= ruleEString )
                    // InternalC2fDSL.g:4175:6: lv_label_16_0= ruleEString
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

                    this_COMMA_17=(Token)match(input,RULE_COMMA,FOLLOW_29); 

                    				newLeafNode(this_COMMA_17, grammarAccess.getRadioButtonGroupAccess().getCOMMATerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getRadioButtonGroupAccess().getPropertyKeyword_9());
            		
            // InternalC2fDSL.g:4201:3: ( ( ruleEString ) )
            // InternalC2fDSL.g:4202:4: ( ruleEString )
            {
            // InternalC2fDSL.g:4202:4: ( ruleEString )
            // InternalC2fDSL.g:4203:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioButtonGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getPropertyStructuralFeatureCrossReference_10_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BRACESCLOSE_20=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_20, grammarAccess.getRadioButtonGroupAccess().getBRACESCLOSETerminalRuleCall_11());
            		

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
    // InternalC2fDSL.g:4225:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalC2fDSL.g:4225:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalC2fDSL.g:4226:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalC2fDSL.g:4232:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:4238:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalC2fDSL.g:4239:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalC2fDSL.g:4239:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalC2fDSL.g:4240:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalC2fDSL.g:4240:3: (kw= '-' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==45) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalC2fDSL.g:4241:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_82); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalC2fDSL.g:4247:3: (this_INT_1= RULE_INT )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_INT) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalC2fDSL.g:4248:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_83); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,63,FOLLOW_47); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_84); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalC2fDSL.g:4268:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=64 && LA87_0<=65)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalC2fDSL.g:4269:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalC2fDSL.g:4269:4: (kw= 'E' | kw= 'e' )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==64) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==65) ) {
                        alt85=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalC2fDSL.g:4270:5: kw= 'E'
                            {
                            kw=(Token)match(input,64,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalC2fDSL.g:4276:5: kw= 'e'
                            {
                            kw=(Token)match(input,65,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalC2fDSL.g:4282:4: (kw= '-' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==45) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalC2fDSL.g:4283:5: kw= '-'
                            {
                            kw=(Token)match(input,45,FOLLOW_47); 

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
    // InternalC2fDSL.g:4301:1: entryRuleIterationFilter returns [EObject current=null] : iv_ruleIterationFilter= ruleIterationFilter EOF ;
    public final EObject entryRuleIterationFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationFilter = null;


        try {
            // InternalC2fDSL.g:4301:56: (iv_ruleIterationFilter= ruleIterationFilter EOF )
            // InternalC2fDSL.g:4302:2: iv_ruleIterationFilter= ruleIterationFilter EOF
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
    // InternalC2fDSL.g:4308:1: ruleIterationFilter returns [EObject current=null] : ( () otherlv_1= 'IterationFilter' this_BRACESOPEN_2= RULE_BRACESOPEN (otherlv_3= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_5= RULE_BRACESCLOSE ) ;
    public final EObject ruleIterationFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BRACESOPEN_2=null;
        Token otherlv_3=null;
        Token this_BRACESCLOSE_5=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:4314:2: ( ( () otherlv_1= 'IterationFilter' this_BRACESOPEN_2= RULE_BRACESOPEN (otherlv_3= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_5= RULE_BRACESCLOSE ) )
            // InternalC2fDSL.g:4315:2: ( () otherlv_1= 'IterationFilter' this_BRACESOPEN_2= RULE_BRACESOPEN (otherlv_3= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_5= RULE_BRACESCLOSE )
            {
            // InternalC2fDSL.g:4315:2: ( () otherlv_1= 'IterationFilter' this_BRACESOPEN_2= RULE_BRACESOPEN (otherlv_3= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_5= RULE_BRACESCLOSE )
            // InternalC2fDSL.g:4316:3: () otherlv_1= 'IterationFilter' this_BRACESOPEN_2= RULE_BRACESOPEN (otherlv_3= 'input' ( ( ruleEString ) ) )? this_BRACESCLOSE_5= RULE_BRACESCLOSE
            {
            // InternalC2fDSL.g:4316:3: ()
            // InternalC2fDSL.g:4317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIterationFilterAccess().getIterationFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIterationFilterAccess().getIterationFilterKeyword_1());
            		
            this_BRACESOPEN_2=(Token)match(input,RULE_BRACESOPEN,FOLLOW_85); 

            			newLeafNode(this_BRACESOPEN_2, grammarAccess.getIterationFilterAccess().getBRACESOPENTerminalRuleCall_2());
            		
            // InternalC2fDSL.g:4331:3: (otherlv_3= 'input' ( ( ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==67) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalC2fDSL.g:4332:4: otherlv_3= 'input' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getIterationFilterAccess().getInputKeyword_3_0());
                    			
                    // InternalC2fDSL.g:4336:4: ( ( ruleEString ) )
                    // InternalC2fDSL.g:4337:5: ( ruleEString )
                    {
                    // InternalC2fDSL.g:4337:5: ( ruleEString )
                    // InternalC2fDSL.g:4338:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIterationFilterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIterationFilterAccess().getInputInputCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_BRACESCLOSE_5=(Token)match(input,RULE_BRACESCLOSE,FOLLOW_2); 

            			newLeafNode(this_BRACESCLOSE_5, grammarAccess.getIterationFilterAccess().getBRACESCLOSETerminalRuleCall_4());
            		

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
    // InternalC2fDSL.g:4361:1: ruleLayoutType returns [Enumerator current=null] : ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) ) ;
    public final Enumerator ruleLayoutType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalC2fDSL.g:4367:2: ( ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) ) )
            // InternalC2fDSL.g:4368:2: ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) )
            {
            // InternalC2fDSL.g:4368:2: ( (enumLiteral_0= 'SINGLE_COLUMN' ) | (enumLiteral_1= 'TWO_COLUMNS' ) | (enumLiteral_2= 'LEFT_BAR' ) | (enumLiteral_3= 'RIGHT_BAR' ) | (enumLiteral_4= 'THREE_COLUMNS' ) )
            int alt89=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt89=1;
                }
                break;
            case 69:
                {
                alt89=2;
                }
                break;
            case 70:
                {
                alt89=3;
                }
                break;
            case 71:
                {
                alt89=4;
                }
                break;
            case 72:
                {
                alt89=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalC2fDSL.g:4369:3: (enumLiteral_0= 'SINGLE_COLUMN' )
                    {
                    // InternalC2fDSL.g:4369:3: (enumLiteral_0= 'SINGLE_COLUMN' )
                    // InternalC2fDSL.g:4370:4: enumLiteral_0= 'SINGLE_COLUMN'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getSINGLE_COLUMNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLayoutTypeAccess().getSINGLE_COLUMNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalC2fDSL.g:4377:3: (enumLiteral_1= 'TWO_COLUMNS' )
                    {
                    // InternalC2fDSL.g:4377:3: (enumLiteral_1= 'TWO_COLUMNS' )
                    // InternalC2fDSL.g:4378:4: enumLiteral_1= 'TWO_COLUMNS'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getTWO_COLUMNSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLayoutTypeAccess().getTWO_COLUMNSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalC2fDSL.g:4385:3: (enumLiteral_2= 'LEFT_BAR' )
                    {
                    // InternalC2fDSL.g:4385:3: (enumLiteral_2= 'LEFT_BAR' )
                    // InternalC2fDSL.g:4386:4: enumLiteral_2= 'LEFT_BAR'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getLEFT_BAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLayoutTypeAccess().getLEFT_BAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalC2fDSL.g:4393:3: (enumLiteral_3= 'RIGHT_BAR' )
                    {
                    // InternalC2fDSL.g:4393:3: (enumLiteral_3= 'RIGHT_BAR' )
                    // InternalC2fDSL.g:4394:4: enumLiteral_3= 'RIGHT_BAR'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getLayoutTypeAccess().getRIGHT_BAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLayoutTypeAccess().getRIGHT_BAREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalC2fDSL.g:4401:3: (enumLiteral_4= 'THREE_COLUMNS' )
                    {
                    // InternalC2fDSL.g:4401:3: (enumLiteral_4= 'THREE_COLUMNS' )
                    // InternalC2fDSL.g:4402:4: enumLiteral_4= 'THREE_COLUMNS'
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
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\4\1\22\7\uffff\1\5\1\uffff\1\12\2\6\1\11\2\uffff";
    static final String dfa_3s = "\1\74\1\76\7\uffff\1\5\1\uffff\1\13\2\6\1\67\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\4\1\5\1\7\1\10\1\11\1\12\1\uffff\1\3\4\uffff\1\1\1\6";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\uffff\2\6\42\uffff\1\3\1\uffff\1\2\3\uffff\1\3\2\4\1\uffff\1\5\3\uffff\1\7",
            "\1\11\36\uffff\1\12\14\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "\1\14\1\15",
            "\1\16",
            "\1\16",
            "\1\20\15\uffff\1\20\1\uffff\1\20\5\uffff\1\20\16\uffff\1\17\10\uffff\1\20",
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
            return "408:2: (this_Autocomplete_0= ruleAutocomplete | this_Dropdownlist_1= ruleDropdownlist | this_Image_2= ruleImage | this_List_3= ruleList | this_InputText_4= ruleInputText | this_StaticContainer_5= ruleStaticContainer | this_TextArea_6= ruleTextArea | this_IterationContainer_7= ruleIterationContainer | this_InputForm_8= ruleInputForm | this_RadioButtonGroup_9= ruleRadioButtonGroup )";
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000000000C10L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E2000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001C2000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000CA2000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C22000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C20000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002082800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002002800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000001000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020082000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800282000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800280000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800200000200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000C000282000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000C000280000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000C000200000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000200000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0008000200000200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0080000082800200L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000080800200L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000000800200L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1171400000000C10L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000008282000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000008280000200L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000008200000200L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0880000082800200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0880000080800200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0880000000800200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0800000000800200L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0800000000000200L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000800282000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000800280000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000800200000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x8000000000001000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000008L});

}