/*
 * generated by Xtext 2.12.0
 */
package co.classlayout2frontend.c2fdsl.ide.contentassist.antlr;

import co.classlayout2frontend.c2fdsl.ide.contentassist.antlr.internal.InternalC2fDSLParser;
import co.classlayout2frontend.c2fdsl.services.C2fDSLGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class C2fDSLParser extends AbstractContentAssistParser {

	@Inject
	private C2fDSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalC2fDSLParser createParser() {
		InternalC2fDSLParser result = new InternalC2fDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getContainerViewAccess().getAlternatives(), "rule__ContainerView__Alternatives");
					put(grammarAccess.getEntityModelElementAccess().getAlternatives(), "rule__EntityModelElement__Alternatives");
					put(grammarAccess.getElementViewAccess().getAlternatives(), "rule__ElementView__Alternatives");
					put(grammarAccess.getPropertyTypeAccess().getAlternatives(), "rule__PropertyType__Alternatives");
					put(grammarAccess.getOutputAccess().getAlternatives(), "rule__Output__Alternatives");
					put(grammarAccess.getAtomicViewAccess().getAlternatives(), "rule__AtomicView__Alternatives");
					put(grammarAccess.getStructuralFeatureAccess().getAlternatives(), "rule__StructuralFeature__Alternatives");
					put(grammarAccess.getInputAccess().getAlternatives(), "rule__Input__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getLayoutTypeAccess().getAlternatives(), "rule__LayoutType__Alternatives");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectAccess().getGroup_18(), "rule__Project__Group_18__0");
					put(grammarAccess.getProjectAccess().getGroup_25(), "rule__Project__Group_25__0");
					put(grammarAccess.getEntitiesModelAccess().getGroup(), "rule__EntitiesModel__Group__0");
					put(grammarAccess.getEntitiesModelAccess().getGroup_10(), "rule__EntitiesModel__Group_10__0");
					put(grammarAccess.getSiteViewAccess().getGroup(), "rule__SiteView__Group__0");
					put(grammarAccess.getSiteViewAccess().getGroup_6(), "rule__SiteView__Group_6__0");
					put(grammarAccess.getPageViewAccess().getGroup(), "rule__PageView__Group__0");
					put(grammarAccess.getPageViewAccess().getGroup_14(), "rule__PageView__Group_14__0");
					put(grammarAccess.getCompositionAccess().getGroup(), "rule__Composition__Group__0");
					put(grammarAccess.getCompositionAccess().getGroup_5(), "rule__Composition__Group_5__0");
					put(grammarAccess.getCompositionAccess().getGroup_6(), "rule__Composition__Group_6__0");
					put(grammarAccess.getCompositionAccess().getGroup_7(), "rule__Composition__Group_7__0");
					put(grammarAccess.getCompositionAccess().getGroup_8(), "rule__Composition__Group_8__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_5(), "rule__Property__Group_5__0");
					put(grammarAccess.getPropertyAccess().getGroup_6(), "rule__Property__Group_6__0");
					put(grammarAccess.getPropertyAccess().getGroup_7(), "rule__Property__Group_7__0");
					put(grammarAccess.getPropertyAccess().getGroup_8(), "rule__Property__Group_8__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_6(), "rule__Entity__Group_6__0");
					put(grammarAccess.getEntityAccess().getGroup_7(), "rule__Entity__Group_7__0");
					put(grammarAccess.getEntityAccess().getGroup_8(), "rule__Entity__Group_8__0");
					put(grammarAccess.getEntityAccess().getGroup_13(), "rule__Entity__Group_13__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
					put(grammarAccess.getLiteralAccess().getGroup(), "rule__Literal__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_6(), "rule__Enumeration__Group_6__0");
					put(grammarAccess.getEnumerationAccess().getGroup_7(), "rule__Enumeration__Group_7__0");
					put(grammarAccess.getEnumerationAccess().getGroup_11(), "rule__Enumeration__Group_11__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup_5(), "rule__Reference__Group_5__0");
					put(grammarAccess.getReferenceAccess().getGroup_6(), "rule__Reference__Group_6__0");
					put(grammarAccess.getReferenceAccess().getGroup_7(), "rule__Reference__Group_7__0");
					put(grammarAccess.getReferenceAccess().getGroup_8(), "rule__Reference__Group_8__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getAutocompleteAccess().getGroup(), "rule__Autocomplete__Group__0");
					put(grammarAccess.getAutocompleteAccess().getGroup_10(), "rule__Autocomplete__Group_10__0");
					put(grammarAccess.getAutocompleteAccess().getGroup_11(), "rule__Autocomplete__Group_11__0");
					put(grammarAccess.getAutocompleteAccess().getGroup_12(), "rule__Autocomplete__Group_12__0");
					put(grammarAccess.getAutocompleteAccess().getGroup_13(), "rule__Autocomplete__Group_13__0");
					put(grammarAccess.getDropdownlistAccess().getGroup(), "rule__Dropdownlist__Group__0");
					put(grammarAccess.getDropdownlistAccess().getGroup_6(), "rule__Dropdownlist__Group_6__0");
					put(grammarAccess.getDropdownlistAccess().getGroup_7(), "rule__Dropdownlist__Group_7__0");
					put(grammarAccess.getDropdownlistAccess().getGroup_8(), "rule__Dropdownlist__Group_8__0");
					put(grammarAccess.getDropdownlistAccess().getGroup_9(), "rule__Dropdownlist__Group_9__0");
					put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
					put(grammarAccess.getImageAccess().getGroup_6(), "rule__Image__Group_6__0");
					put(grammarAccess.getImageAccess().getGroup_7(), "rule__Image__Group_7__0");
					put(grammarAccess.getImageAccess().getGroup_8(), "rule__Image__Group_8__0");
					put(grammarAccess.getImageAccess().getGroup_9(), "rule__Image__Group_9__0");
					put(grammarAccess.getImageAccess().getGroup_10(), "rule__Image__Group_10__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getListAccess().getGroup_6(), "rule__List__Group_6__0");
					put(grammarAccess.getListAccess().getGroup_7(), "rule__List__Group_7__0");
					put(grammarAccess.getListAccess().getGroup_8(), "rule__List__Group_8__0");
					put(grammarAccess.getListAccess().getGroup_9(), "rule__List__Group_9__0");
					put(grammarAccess.getListAccess().getGroup_10(), "rule__List__Group_10__0");
					put(grammarAccess.getInputTextAccess().getGroup(), "rule__InputText__Group__0");
					put(grammarAccess.getInputTextAccess().getGroup_6(), "rule__InputText__Group_6__0");
					put(grammarAccess.getInputTextAccess().getGroup_7(), "rule__InputText__Group_7__0");
					put(grammarAccess.getInputTextAccess().getGroup_8(), "rule__InputText__Group_8__0");
					put(grammarAccess.getInputTextAccess().getGroup_9(), "rule__InputText__Group_9__0");
					put(grammarAccess.getInputTextAccess().getGroup_10(), "rule__InputText__Group_10__0");
					put(grammarAccess.getStaticContainerAccess().getGroup(), "rule__StaticContainer__Group__0");
					put(grammarAccess.getStaticContainerAccess().getGroup_6(), "rule__StaticContainer__Group_6__0");
					put(grammarAccess.getStaticContainerAccess().getGroup_7(), "rule__StaticContainer__Group_7__0");
					put(grammarAccess.getStaticContainerAccess().getGroup_8(), "rule__StaticContainer__Group_8__0");
					put(grammarAccess.getStaticContainerAccess().getGroup_9(), "rule__StaticContainer__Group_9__0");
					put(grammarAccess.getStaticContainerAccess().getGroup_9_4(), "rule__StaticContainer__Group_9_4__0");
					put(grammarAccess.getTextAreaAccess().getGroup(), "rule__TextArea__Group__0");
					put(grammarAccess.getTextAreaAccess().getGroup_10(), "rule__TextArea__Group_10__0");
					put(grammarAccess.getTextAreaAccess().getGroup_11(), "rule__TextArea__Group_11__0");
					put(grammarAccess.getTextAreaAccess().getGroup_12(), "rule__TextArea__Group_12__0");
					put(grammarAccess.getTextAreaAccess().getGroup_13(), "rule__TextArea__Group_13__0");
					put(grammarAccess.getIterationContainerAccess().getGroup(), "rule__IterationContainer__Group__0");
					put(grammarAccess.getIterationContainerAccess().getGroup_6(), "rule__IterationContainer__Group_6__0");
					put(grammarAccess.getIterationContainerAccess().getGroup_7(), "rule__IterationContainer__Group_7__0");
					put(grammarAccess.getIterationContainerAccess().getGroup_8(), "rule__IterationContainer__Group_8__0");
					put(grammarAccess.getIterationContainerAccess().getGroup_9(), "rule__IterationContainer__Group_9__0");
					put(grammarAccess.getIterationContainerAccess().getGroup_9_4(), "rule__IterationContainer__Group_9_4__0");
					put(grammarAccess.getIterationContainerAccess().getGroup_10(), "rule__IterationContainer__Group_10__0");
					put(grammarAccess.getIterationContainerAccess().getGroup_10_4(), "rule__IterationContainer__Group_10_4__0");
					put(grammarAccess.getInputFormAccess().getGroup(), "rule__InputForm__Group__0");
					put(grammarAccess.getInputFormAccess().getGroup_6(), "rule__InputForm__Group_6__0");
					put(grammarAccess.getInputFormAccess().getGroup_7(), "rule__InputForm__Group_7__0");
					put(grammarAccess.getInputFormAccess().getGroup_16(), "rule__InputForm__Group_16__0");
					put(grammarAccess.getCheckListAccess().getGroup(), "rule__CheckList__Group__0");
					put(grammarAccess.getCheckListAccess().getGroup_6(), "rule__CheckList__Group_6__0");
					put(grammarAccess.getCheckListAccess().getGroup_7(), "rule__CheckList__Group_7__0");
					put(grammarAccess.getCheckListAccess().getGroup_8(), "rule__CheckList__Group_8__0");
					put(grammarAccess.getCheckListAccess().getGroup_9(), "rule__CheckList__Group_9__0");
					put(grammarAccess.getRadioButtonGroupAccess().getGroup(), "rule__RadioButtonGroup__Group__0");
					put(grammarAccess.getRadioButtonGroupAccess().getGroup_6(), "rule__RadioButtonGroup__Group_6__0");
					put(grammarAccess.getRadioButtonGroupAccess().getGroup_7(), "rule__RadioButtonGroup__Group_7__0");
					put(grammarAccess.getRadioButtonGroupAccess().getGroup_8(), "rule__RadioButtonGroup__Group_8__0");
					put(grammarAccess.getFileUploadAccess().getGroup(), "rule__FileUpload__Group__0");
					put(grammarAccess.getFileUploadAccess().getGroup_6(), "rule__FileUpload__Group_6__0");
					put(grammarAccess.getFileUploadAccess().getGroup_7(), "rule__FileUpload__Group_7__0");
					put(grammarAccess.getFileUploadAccess().getGroup_8(), "rule__FileUpload__Group_8__0");
					put(grammarAccess.getFileUploadAccess().getGroup_9(), "rule__FileUpload__Group_9__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getIterationFilterAccess().getGroup(), "rule__IterationFilter__Group__0");
					put(grammarAccess.getIterationFilterAccess().getGroup_2(), "rule__IterationFilter__Group_2__0");
					put(grammarAccess.getProjectAccess().getNameAssignment_4(), "rule__Project__NameAssignment_4");
					put(grammarAccess.getProjectAccess().getEntitiesmodelAssignment_8(), "rule__Project__EntitiesmodelAssignment_8");
					put(grammarAccess.getProjectAccess().getSiteViewsAssignment_12(), "rule__Project__SiteViewsAssignment_12");
					put(grammarAccess.getProjectAccess().getContainerViewsAssignment_17(), "rule__Project__ContainerViewsAssignment_17");
					put(grammarAccess.getProjectAccess().getContainerViewsAssignment_18_1(), "rule__Project__ContainerViewsAssignment_18_1");
					put(grammarAccess.getProjectAccess().getPageViewsAssignment_24(), "rule__Project__PageViewsAssignment_24");
					put(grammarAccess.getProjectAccess().getPageViewsAssignment_25_1(), "rule__Project__PageViewsAssignment_25_1");
					put(grammarAccess.getEntitiesModelAccess().getNameAssignment_4(), "rule__EntitiesModel__NameAssignment_4");
					put(grammarAccess.getEntitiesModelAccess().getModelElementsAssignment_9(), "rule__EntitiesModel__ModelElementsAssignment_9");
					put(grammarAccess.getEntitiesModelAccess().getModelElementsAssignment_10_1(), "rule__EntitiesModel__ModelElementsAssignment_10_1");
					put(grammarAccess.getSiteViewAccess().getNameAssignment_4(), "rule__SiteView__NameAssignment_4");
					put(grammarAccess.getSiteViewAccess().getTemplateColorAssignment_6_2(), "rule__SiteView__TemplateColorAssignment_6_2");
					put(grammarAccess.getSiteViewAccess().getDisplayNameAssignment_9(), "rule__SiteView__DisplayNameAssignment_9");
					put(grammarAccess.getPageViewAccess().getNameAssignment_4(), "rule__PageView__NameAssignment_4");
					put(grammarAccess.getPageViewAccess().getLayoutTypeAssignment_8(), "rule__PageView__LayoutTypeAssignment_8");
					put(grammarAccess.getPageViewAccess().getElementViewsAssignment_13(), "rule__PageView__ElementViewsAssignment_13");
					put(grammarAccess.getPageViewAccess().getElementViewsAssignment_14_1(), "rule__PageView__ElementViewsAssignment_14_1");
					put(grammarAccess.getCompositionAccess().getNameAssignment_3(), "rule__Composition__NameAssignment_3");
					put(grammarAccess.getCompositionAccess().getRequiredAssignment_5_2(), "rule__Composition__RequiredAssignment_5_2");
					put(grammarAccess.getCompositionAccess().getManyAssignment_6_2(), "rule__Composition__ManyAssignment_6_2");
					put(grammarAccess.getCompositionAccess().getDescriptionAssignment_7_2(), "rule__Composition__DescriptionAssignment_7_2");
					put(grammarAccess.getCompositionAccess().getDisplayNameAssignment_8_2(), "rule__Composition__DisplayNameAssignment_8_2");
					put(grammarAccess.getCompositionAccess().getTargetAssignment_11(), "rule__Composition__TargetAssignment_11");
					put(grammarAccess.getPropertyAccess().getNameAssignment_3(), "rule__Property__NameAssignment_3");
					put(grammarAccess.getPropertyAccess().getDescriptionAssignment_5_2(), "rule__Property__DescriptionAssignment_5_2");
					put(grammarAccess.getPropertyAccess().getDisplayNameAssignment_6_2(), "rule__Property__DisplayNameAssignment_6_2");
					put(grammarAccess.getPropertyAccess().getDefaultValueAssignment_7_2(), "rule__Property__DefaultValueAssignment_7_2");
					put(grammarAccess.getPropertyAccess().getRequiredAssignment_8_2(), "rule__Property__RequiredAssignment_8_2");
					put(grammarAccess.getPropertyAccess().getTypeAssignment_11(), "rule__Property__TypeAssignment_11");
					put(grammarAccess.getEntityAccess().getNameAssignment_4(), "rule__Entity__NameAssignment_4");
					put(grammarAccess.getEntityAccess().getDescriptionAssignment_6_2(), "rule__Entity__DescriptionAssignment_6_2");
					put(grammarAccess.getEntityAccess().getDisplayNameAssignment_7_2(), "rule__Entity__DisplayNameAssignment_7_2");
					put(grammarAccess.getEntityAccess().getSuperclassAssignment_8_1(), "rule__Entity__SuperclassAssignment_8_1");
					put(grammarAccess.getEntityAccess().getStructuralFeaturesAssignment_12(), "rule__Entity__StructuralFeaturesAssignment_12");
					put(grammarAccess.getEntityAccess().getStructuralFeaturesAssignment_13_1(), "rule__Entity__StructuralFeaturesAssignment_13_1");
					put(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_4(), "rule__PrimitiveType__NameAssignment_4");
					put(grammarAccess.getLiteralAccess().getNameAssignment_3(), "rule__Literal__NameAssignment_3");
					put(grammarAccess.getLiteralAccess().getValueAssignment_6(), "rule__Literal__ValueAssignment_6");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_4(), "rule__Enumeration__NameAssignment_4");
					put(grammarAccess.getEnumerationAccess().getDescriptionAssignment_6_2(), "rule__Enumeration__DescriptionAssignment_6_2");
					put(grammarAccess.getEnumerationAccess().getDisplayNameAssignment_7_2(), "rule__Enumeration__DisplayNameAssignment_7_2");
					put(grammarAccess.getEnumerationAccess().getLiteralsAssignment_10(), "rule__Enumeration__LiteralsAssignment_10");
					put(grammarAccess.getEnumerationAccess().getLiteralsAssignment_11_1(), "rule__Enumeration__LiteralsAssignment_11_1");
					put(grammarAccess.getReferenceAccess().getNameAssignment_3(), "rule__Reference__NameAssignment_3");
					put(grammarAccess.getReferenceAccess().getRequiredAssignment_5_2(), "rule__Reference__RequiredAssignment_5_2");
					put(grammarAccess.getReferenceAccess().getManyAssignment_6_2(), "rule__Reference__ManyAssignment_6_2");
					put(grammarAccess.getReferenceAccess().getDescriptionAssignment_7_2(), "rule__Reference__DescriptionAssignment_7_2");
					put(grammarAccess.getReferenceAccess().getDisplayNameAssignment_8_2(), "rule__Reference__DisplayNameAssignment_8_2");
					put(grammarAccess.getReferenceAccess().getTargetAssignment_11(), "rule__Reference__TargetAssignment_11");
					put(grammarAccess.getAutocompleteAccess().getNameAssignment_4(), "rule__Autocomplete__NameAssignment_4");
					put(grammarAccess.getAutocompleteAccess().getMultipleAssignment_8(), "rule__Autocomplete__MultipleAssignment_8");
					put(grammarAccess.getAutocompleteAccess().getDisplayNameAssignment_10_1(), "rule__Autocomplete__DisplayNameAssignment_10_1");
					put(grammarAccess.getAutocompleteAccess().getDescriptionAssignment_11_1(), "rule__Autocomplete__DescriptionAssignment_11_1");
					put(grammarAccess.getAutocompleteAccess().getLabelAssignment_12_1(), "rule__Autocomplete__LabelAssignment_12_1");
					put(grammarAccess.getAutocompleteAccess().getPropertyAssignment_13_1(), "rule__Autocomplete__PropertyAssignment_13_1");
					put(grammarAccess.getDropdownlistAccess().getNameAssignment_4(), "rule__Dropdownlist__NameAssignment_4");
					put(grammarAccess.getDropdownlistAccess().getDisplayNameAssignment_6_2(), "rule__Dropdownlist__DisplayNameAssignment_6_2");
					put(grammarAccess.getDropdownlistAccess().getDescriptionAssignment_7_2(), "rule__Dropdownlist__DescriptionAssignment_7_2");
					put(grammarAccess.getDropdownlistAccess().getLabelAssignment_8_2(), "rule__Dropdownlist__LabelAssignment_8_2");
					put(grammarAccess.getDropdownlistAccess().getPropertyAssignment_9_2(), "rule__Dropdownlist__PropertyAssignment_9_2");
					put(grammarAccess.getImageAccess().getNameAssignment_4(), "rule__Image__NameAssignment_4");
					put(grammarAccess.getImageAccess().getDisplayNameAssignment_6_2(), "rule__Image__DisplayNameAssignment_6_2");
					put(grammarAccess.getImageAccess().getDescriptionAssignment_7_2(), "rule__Image__DescriptionAssignment_7_2");
					put(grammarAccess.getImageAccess().getWidthAssignment_8_2(), "rule__Image__WidthAssignment_8_2");
					put(grammarAccess.getImageAccess().getHeightAssignment_9_2(), "rule__Image__HeightAssignment_9_2");
					put(grammarAccess.getImageAccess().getPropertyAssignment_10_2(), "rule__Image__PropertyAssignment_10_2");
					put(grammarAccess.getListAccess().getNameAssignment_4(), "rule__List__NameAssignment_4");
					put(grammarAccess.getListAccess().getMultipleAssignment_6_2(), "rule__List__MultipleAssignment_6_2");
					put(grammarAccess.getListAccess().getDisplayNameAssignment_7_2(), "rule__List__DisplayNameAssignment_7_2");
					put(grammarAccess.getListAccess().getDescriptionAssignment_8_2(), "rule__List__DescriptionAssignment_8_2");
					put(grammarAccess.getListAccess().getLabelAssignment_9_2(), "rule__List__LabelAssignment_9_2");
					put(grammarAccess.getListAccess().getPropertyAssignment_10_2(), "rule__List__PropertyAssignment_10_2");
					put(grammarAccess.getInputTextAccess().getNameAssignment_4(), "rule__InputText__NameAssignment_4");
					put(grammarAccess.getInputTextAccess().getMultilineAssignment_6_2(), "rule__InputText__MultilineAssignment_6_2");
					put(grammarAccess.getInputTextAccess().getDisplayNameAssignment_7_2(), "rule__InputText__DisplayNameAssignment_7_2");
					put(grammarAccess.getInputTextAccess().getDescriptionAssignment_8_2(), "rule__InputText__DescriptionAssignment_8_2");
					put(grammarAccess.getInputTextAccess().getLabelAssignment_9_2(), "rule__InputText__LabelAssignment_9_2");
					put(grammarAccess.getInputTextAccess().getPropertyAssignment_10_2(), "rule__InputText__PropertyAssignment_10_2");
					put(grammarAccess.getStaticContainerAccess().getNameAssignment_4(), "rule__StaticContainer__NameAssignment_4");
					put(grammarAccess.getStaticContainerAccess().getDisplayNameAssignment_6_2(), "rule__StaticContainer__DisplayNameAssignment_6_2");
					put(grammarAccess.getStaticContainerAccess().getDescriptionAssignment_7_2(), "rule__StaticContainer__DescriptionAssignment_7_2");
					put(grammarAccess.getStaticContainerAccess().getEntityAssignment_8_2(), "rule__StaticContainer__EntityAssignment_8_2");
					put(grammarAccess.getStaticContainerAccess().getElementsAssignment_9_3(), "rule__StaticContainer__ElementsAssignment_9_3");
					put(grammarAccess.getStaticContainerAccess().getElementsAssignment_9_4_1(), "rule__StaticContainer__ElementsAssignment_9_4_1");
					put(grammarAccess.getTextAreaAccess().getNameAssignment_4(), "rule__TextArea__NameAssignment_4");
					put(grammarAccess.getTextAreaAccess().getIsTitleAssignment_8(), "rule__TextArea__IsTitleAssignment_8");
					put(grammarAccess.getTextAreaAccess().getDisplayNameAssignment_10_2(), "rule__TextArea__DisplayNameAssignment_10_2");
					put(grammarAccess.getTextAreaAccess().getDescriptionAssignment_11_2(), "rule__TextArea__DescriptionAssignment_11_2");
					put(grammarAccess.getTextAreaAccess().getValueAssignment_12_2(), "rule__TextArea__ValueAssignment_12_2");
					put(grammarAccess.getTextAreaAccess().getPropertyAssignment_13_2(), "rule__TextArea__PropertyAssignment_13_2");
					put(grammarAccess.getIterationContainerAccess().getNameAssignment_4(), "rule__IterationContainer__NameAssignment_4");
					put(grammarAccess.getIterationContainerAccess().getDisplayNameAssignment_6_2(), "rule__IterationContainer__DisplayNameAssignment_6_2");
					put(grammarAccess.getIterationContainerAccess().getDescriptionAssignment_7_2(), "rule__IterationContainer__DescriptionAssignment_7_2");
					put(grammarAccess.getIterationContainerAccess().getEntityAssignment_8_2(), "rule__IterationContainer__EntityAssignment_8_2");
					put(grammarAccess.getIterationContainerAccess().getElementsAssignment_9_3(), "rule__IterationContainer__ElementsAssignment_9_3");
					put(grammarAccess.getIterationContainerAccess().getElementsAssignment_9_4_1(), "rule__IterationContainer__ElementsAssignment_9_4_1");
					put(grammarAccess.getIterationContainerAccess().getIterationFiltersAssignment_10_3(), "rule__IterationContainer__IterationFiltersAssignment_10_3");
					put(grammarAccess.getIterationContainerAccess().getIterationFiltersAssignment_10_4_1(), "rule__IterationContainer__IterationFiltersAssignment_10_4_1");
					put(grammarAccess.getInputFormAccess().getNameAssignment_4(), "rule__InputForm__NameAssignment_4");
					put(grammarAccess.getInputFormAccess().getDisplayNameAssignment_6_2(), "rule__InputForm__DisplayNameAssignment_6_2");
					put(grammarAccess.getInputFormAccess().getDescriptionAssignment_7_2(), "rule__InputForm__DescriptionAssignment_7_2");
					put(grammarAccess.getInputFormAccess().getEntityAssignment_10(), "rule__InputForm__EntityAssignment_10");
					put(grammarAccess.getInputFormAccess().getElementsAssignment_15(), "rule__InputForm__ElementsAssignment_15");
					put(grammarAccess.getInputFormAccess().getElementsAssignment_16_1(), "rule__InputForm__ElementsAssignment_16_1");
					put(grammarAccess.getCheckListAccess().getNameAssignment_4(), "rule__CheckList__NameAssignment_4");
					put(grammarAccess.getCheckListAccess().getDisplayNameAssignment_6_1(), "rule__CheckList__DisplayNameAssignment_6_1");
					put(grammarAccess.getCheckListAccess().getDescriptionAssignment_7_1(), "rule__CheckList__DescriptionAssignment_7_1");
					put(grammarAccess.getCheckListAccess().getLabelAssignment_8_1(), "rule__CheckList__LabelAssignment_8_1");
					put(grammarAccess.getCheckListAccess().getPropertyAssignment_9_1(), "rule__CheckList__PropertyAssignment_9_1");
					put(grammarAccess.getRadioButtonGroupAccess().getNameAssignment_4(), "rule__RadioButtonGroup__NameAssignment_4");
					put(grammarAccess.getRadioButtonGroupAccess().getDisplayNameAssignment_6_2(), "rule__RadioButtonGroup__DisplayNameAssignment_6_2");
					put(grammarAccess.getRadioButtonGroupAccess().getDescriptionAssignment_7_2(), "rule__RadioButtonGroup__DescriptionAssignment_7_2");
					put(grammarAccess.getRadioButtonGroupAccess().getLabelAssignment_8_2(), "rule__RadioButtonGroup__LabelAssignment_8_2");
					put(grammarAccess.getRadioButtonGroupAccess().getPropertyAssignment_11(), "rule__RadioButtonGroup__PropertyAssignment_11");
					put(grammarAccess.getFileUploadAccess().getNameAssignment_4(), "rule__FileUpload__NameAssignment_4");
					put(grammarAccess.getFileUploadAccess().getDisplayNameAssignment_6_1(), "rule__FileUpload__DisplayNameAssignment_6_1");
					put(grammarAccess.getFileUploadAccess().getDescriptionAssignment_7_1(), "rule__FileUpload__DescriptionAssignment_7_1");
					put(grammarAccess.getFileUploadAccess().getLabelAssignment_8_1(), "rule__FileUpload__LabelAssignment_8_1");
					put(grammarAccess.getFileUploadAccess().getPropertyAssignment_9_1(), "rule__FileUpload__PropertyAssignment_9_1");
					put(grammarAccess.getIterationFilterAccess().getInputAssignment_2_1(), "rule__IterationFilter__InputAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public C2fDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(C2fDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}