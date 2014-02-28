package edu.gatech.sqltutor.rules.symbolic.tokens;

import edu.gatech.sqltutor.rules.symbolic.PartOfSpeech;
import edu.gatech.sqltutor.rules.symbolic.SymbolicType;


/** A series of literal tokens. */
public class LiteralsToken extends ChildContainerToken implements ISymbolicToken {
	public LiteralsToken(LiteralsToken token) {
		super(token);
	}
	
	public LiteralsToken(PartOfSpeech pos) {
		super(pos);
	}
	
	@Override
	protected boolean canAcceptChild(ISymbolicToken tok) {
		if( tok == null ) return false;
		return SymbolicType.LITERAL.equals(tok.getType());
	}

	@Override
	public SymbolicType getType() {
		return SymbolicType.LITERALS;
	}
}