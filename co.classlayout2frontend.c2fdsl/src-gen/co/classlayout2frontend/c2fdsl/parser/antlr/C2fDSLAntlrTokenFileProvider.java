/*
 * generated by Xtext 2.12.0
 */
package co.classlayout2frontend.c2fdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class C2fDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("co/classlayout2frontend/c2fdsl/parser/antlr/internal/InternalC2fDSL.tokens");
	}
}
