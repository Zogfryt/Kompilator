// Generated from C:/Users/bartw/OneDrive/Pulpit/Kompilator/Main/src/main/grammar\PythonG3.g4 by ANTLR 4.10.1
package com.demo.lexerAndParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonG3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, NULL=3, IF=4, ELSE=5, ELSE_IF=6, FOR=7, WHILE=8, CONTINUE=9, 
		BREAK=10, CONST_AND=11, CONST_OR=12, NEGATION=13, IN=14, PLUS=15, MINUS=16, 
		MULTIPLICATION=17, DIVISION=18, MODULO=19, EQUALITY=20, INEQUALITY=21, 
		GREATER=22, GREATER_OR_EQUAL=23, SMALLER=24, SMALLER_OR_EQUAL=25, ASSIGNMENT=26, 
		LEFT_PARENTHESIS=27, RIGHT_PARENTHESIS=28, COLON=29, INCREASE_ADD=30, 
		DECREASE_SUBSTRACT=31, INCREASE_MULTIPLY=32, DECREASE_DIVISION=33, DECREASE_MODULO=34, 
		LEFT_BRACKET=35, RIGHT_BRACKET=36, SEPARATOR=37, LEFT_CURLY=38, RIGHT_CURLY=39, 
		STRING=40, STRING_LITERAL=41, NEWLINE=42, INT=43, FLOAT=44, VARIABLE=45, 
		WS=46, INCORECT_CHAR=47;
	public static final int
		RULE_file_input = 0, RULE_statement = 1, RULE_simple_statement = 2, RULE_assign_statement = 3, 
		RULE_expression = 4, RULE_conjunction = 5, RULE_inversion = 6, RULE_comparative = 7, 
		RULE_comparative_tail = 8, RULE_comparative_less = 9, RULE_comparative_eq_less = 10, 
		RULE_comparative_more = 11, RULE_comparative_eq_more = 12, RULE_comparative_eq = 13, 
		RULE_sum = 14, RULE_mult = 15, RULE_atom = 16, RULE_increment_statement = 17, 
		RULE_block_statement = 18, RULE_while_statement = 19, RULE_if_statement = 20, 
		RULE_for_statement = 21, RULE_table = 22, RULE_list_of_variables = 23, 
		RULE_block = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "statement", "simple_statement", "assign_statement", "expression", 
			"conjunction", "inversion", "comparative", "comparative_tail", "comparative_less", 
			"comparative_eq_less", "comparative_more", "comparative_eq_more", "comparative_eq", 
			"sum", "mult", "atom", "increment_statement", "block_statement", "while_statement", 
			"if_statement", "for_statement", "table", "list_of_variables", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'True'", "'False'", "'None'", "'if'", "'else'", "'elif'", "'for'", 
			"'while'", "'continue'", "'break'", "'and'", "'or'", "'not'", "'in'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", 
			"'<='", "'='", "'('", "')'", "':'", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'['", "']'", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "NULL", "IF", "ELSE", "ELSE_IF", "FOR", "WHILE", 
			"CONTINUE", "BREAK", "CONST_AND", "CONST_OR", "NEGATION", "IN", "PLUS", 
			"MINUS", "MULTIPLICATION", "DIVISION", "MODULO", "EQUALITY", "INEQUALITY", 
			"GREATER", "GREATER_OR_EQUAL", "SMALLER", "SMALLER_OR_EQUAL", "ASSIGNMENT", 
			"LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "COLON", "INCREASE_ADD", "DECREASE_SUBSTRACT", 
			"INCREASE_MULTIPLY", "DECREASE_DIVISION", "DECREASE_MODULO", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "SEPARATOR", "LEFT_CURLY", "RIGHT_CURLY", "STRING", 
			"STRING_LITERAL", "NEWLINE", "INT", "FLOAT", "VARIABLE", "WS", "INCORECT_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonG3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonG3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonG3Parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonG3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonG3Parser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << NEWLINE) | (1L << VARIABLE))) != 0)) {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(50);
					match(NEWLINE);
					}
					break;
				case IF:
				case FOR:
				case WHILE:
				case CONTINUE:
				case BREAK:
				case VARIABLE:
					{
					setState(51);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
			case BREAK:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				simple_statement();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				block_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_statementContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PythonG3Parser.NEWLINE, 0); }
		public Increment_statementContext increment_statement() {
			return getRuleContext(Increment_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(PythonG3Parser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(PythonG3Parser.BREAK, 0); }
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(63);
				increment_statement();
				}
				break;
			case 2:
				{
				setState(64);
				assign_statement();
				}
				break;
			case 3:
				{
				setState(65);
				match(CONTINUE);
				}
				break;
			case 4:
				{
				setState(66);
				match(BREAK);
				}
				break;
			}
			setState(69);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(PythonG3Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(PythonG3Parser.VARIABLE, i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(PythonG3Parser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(PythonG3Parser.ASSIGNMENT, i);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(71);
					match(VARIABLE);
					setState(72);
					match(ASSIGNMENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(77);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST_OR() { return getToken(PythonG3Parser.CONST_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			conjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(82);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(83);
					match(CONST_OR);
					setState(84);
					conjunction(0);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public TerminalNode CONST_AND() { return getToken(PythonG3Parser.CONST_AND, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		return conjunction(0);
	}

	private ConjunctionContext conjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, _parentState);
		ConjunctionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_conjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			inversion();
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjunction);
					setState(93);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(94);
					match(CONST_AND);
					setState(95);
					inversion();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InversionContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(PythonG3Parser.NEGATION, 0); }
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public ComparativeContext comparative() {
			return getRuleContext(ComparativeContext.class,0);
		}
		public InversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterInversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitInversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitInversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InversionContext inversion() throws RecognitionException {
		InversionContext _localctx = new InversionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inversion);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(NEGATION);
				setState(102);
				inversion();
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case LEFT_PARENTHESIS:
			case STRING:
			case INT:
			case FLOAT:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				comparative();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparativeContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Comparative_tailContext comparative_tail() {
			return getRuleContext(Comparative_tailContext.class,0);
		}
		public ComparativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterComparative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitComparative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitComparative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparativeContext comparative() throws RecognitionException {
		ComparativeContext _localctx = new ComparativeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparative);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				sum(0);
				setState(107);
				comparative_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				sum(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparative_tailContext extends ParserRuleContext {
		public Comparative_lessContext comparative_less() {
			return getRuleContext(Comparative_lessContext.class,0);
		}
		public Comparative_eq_lessContext comparative_eq_less() {
			return getRuleContext(Comparative_eq_lessContext.class,0);
		}
		public Comparative_moreContext comparative_more() {
			return getRuleContext(Comparative_moreContext.class,0);
		}
		public Comparative_eq_moreContext comparative_eq_more() {
			return getRuleContext(Comparative_eq_moreContext.class,0);
		}
		public Comparative_eqContext comparative_eq() {
			return getRuleContext(Comparative_eqContext.class,0);
		}
		public Comparative_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterComparative_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitComparative_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitComparative_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_tailContext comparative_tail() throws RecognitionException {
		Comparative_tailContext _localctx = new Comparative_tailContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparative_tail);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SMALLER:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				comparative_less();
				}
				break;
			case SMALLER_OR_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				comparative_eq_less();
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				comparative_more();
				}
				break;
			case GREATER_OR_EQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				comparative_eq_more();
				}
				break;
			case EQUALITY:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				comparative_eq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparative_lessContext extends ParserRuleContext {
		public TerminalNode SMALLER() { return getToken(PythonG3Parser.SMALLER, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Comparative_lessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterComparative_less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitComparative_less(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitComparative_less(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_lessContext comparative_less() throws RecognitionException {
		Comparative_lessContext _localctx = new Comparative_lessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparative_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(SMALLER);
			setState(120);
			sum(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparative_eq_lessContext extends ParserRuleContext {
		public TerminalNode SMALLER_OR_EQUAL() { return getToken(PythonG3Parser.SMALLER_OR_EQUAL, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Comparative_eq_lessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_eq_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterComparative_eq_less(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitComparative_eq_less(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitComparative_eq_less(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_eq_lessContext comparative_eq_less() throws RecognitionException {
		Comparative_eq_lessContext _localctx = new Comparative_eq_lessContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparative_eq_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(SMALLER_OR_EQUAL);
			setState(123);
			sum(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparative_moreContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(PythonG3Parser.GREATER, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Comparative_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterComparative_more(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitComparative_more(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitComparative_more(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_moreContext comparative_more() throws RecognitionException {
		Comparative_moreContext _localctx = new Comparative_moreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparative_more);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(GREATER);
			setState(126);
			sum(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparative_eq_moreContext extends ParserRuleContext {
		public TerminalNode GREATER_OR_EQUAL() { return getToken(PythonG3Parser.GREATER_OR_EQUAL, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Comparative_eq_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_eq_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterComparative_eq_more(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitComparative_eq_more(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitComparative_eq_more(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_eq_moreContext comparative_eq_more() throws RecognitionException {
		Comparative_eq_moreContext _localctx = new Comparative_eq_moreContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparative_eq_more);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(GREATER_OR_EQUAL);
			setState(129);
			sum(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparative_eqContext extends ParserRuleContext {
		public TerminalNode EQUALITY() { return getToken(PythonG3Parser.EQUALITY, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Comparative_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparative_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterComparative_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitComparative_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitComparative_eq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparative_eqContext comparative_eq() throws RecognitionException {
		Comparative_eqContext _localctx = new Comparative_eqContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparative_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(EQUALITY);
			setState(132);
			sum(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonG3Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonG3Parser.MINUS, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_sum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			mult(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(138);
						match(PLUS);
						setState(139);
						mult(0);
						}
						break;
					case 2:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						match(MINUS);
						setState(142);
						mult(0);
						}
						break;
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TerminalNode MULTIPLICATION() { return getToken(PythonG3Parser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(PythonG3Parser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(PythonG3Parser.MODULO, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		return mult(0);
	}

	private MultContext mult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultContext _localctx = new MultContext(_ctx, _parentState);
		MultContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_mult, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(149);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mult);
						setState(151);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(152);
						match(MULTIPLICATION);
						setState(153);
						atom();
						}
						break;
					case 2:
						{
						_localctx = new MultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mult);
						setState(154);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(155);
						match(DIVISION);
						setState(156);
						atom();
						}
						break;
					case 3:
						{
						_localctx = new MultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mult);
						setState(157);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(158);
						match(MODULO);
						setState(159);
						atom();
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PythonG3Parser.VARIABLE, 0); }
		public TerminalNode INT() { return getToken(PythonG3Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PythonG3Parser.FLOAT, 0); }
		public TerminalNode FALSE() { return getToken(PythonG3Parser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(PythonG3Parser.TRUE, 0); }
		public TerminalNode NULL() { return getToken(PythonG3Parser.NULL, 0); }
		public TerminalNode STRING() { return getToken(PythonG3Parser.STRING, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(PythonG3Parser.LEFT_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(PythonG3Parser.RIGHT_PARENTHESIS, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(VARIABLE);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(FLOAT);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(FALSE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(TRUE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(NULL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(STRING);
				}
				break;
			case LEFT_PARENTHESIS:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				match(LEFT_PARENTHESIS);
				setState(173);
				expression(0);
				setState(174);
				match(RIGHT_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increment_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(PythonG3Parser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREASE_ADD() { return getToken(PythonG3Parser.INCREASE_ADD, 0); }
		public TerminalNode INCREASE_MULTIPLY() { return getToken(PythonG3Parser.INCREASE_MULTIPLY, 0); }
		public TerminalNode DECREASE_DIVISION() { return getToken(PythonG3Parser.DECREASE_DIVISION, 0); }
		public TerminalNode DECREASE_MODULO() { return getToken(PythonG3Parser.DECREASE_MODULO, 0); }
		public TerminalNode DECREASE_SUBSTRACT() { return getToken(PythonG3Parser.DECREASE_SUBSTRACT, 0); }
		public Increment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterIncrement_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitIncrement_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitIncrement_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increment_statementContext increment_statement() throws RecognitionException {
		Increment_statementContext _localctx = new Increment_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_increment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(VARIABLE);
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCREASE_ADD) | (1L << DECREASE_SUBSTRACT) | (1L << INCREASE_MULTIPLY) | (1L << DECREASE_DIVISION) | (1L << DECREASE_MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block_statement);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				for_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonG3Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonG3Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WHILE);
			setState(188);
			expression(0);
			setState(189);
			match(COLON);
			setState(190);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonG3Parser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonG3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonG3Parser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(PythonG3Parser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(PythonG3Parser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonG3Parser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IF);
			setState(193);
			expression(0);
			setState(194);
			match(COLON);
			setState(195);
			block();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(196);
				match(ELSE_IF);
				setState(197);
				expression(0);
				setState(198);
				match(COLON);
				setState(199);
				block();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(206);
				match(ELSE);
				setState(207);
				match(COLON);
				setState(208);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonG3Parser.FOR, 0); }
		public TerminalNode VARIABLE() { return getToken(PythonG3Parser.VARIABLE, 0); }
		public TerminalNode IN() { return getToken(PythonG3Parser.IN, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonG3Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FOR);
			setState(212);
			match(VARIABLE);
			setState(213);
			match(IN);
			setState(214);
			table();
			setState(215);
			match(COLON);
			setState(216);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(PythonG3Parser.LEFT_BRACKET, 0); }
		public List_of_variablesContext list_of_variables() {
			return getRuleContext(List_of_variablesContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(PythonG3Parser.RIGHT_BRACKET, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(LEFT_BRACKET);
			setState(219);
			list_of_variables();
			setState(220);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_of_variablesContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(PythonG3Parser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(PythonG3Parser.SEPARATOR, i);
		}
		public List_of_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterList_of_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitList_of_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitList_of_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_variablesContext list_of_variables() throws RecognitionException {
		List_of_variablesContext _localctx = new List_of_variablesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list_of_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			atom();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(223);
				match(SEPARATOR);
				setState(224);
				atom();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public TerminalNode LEFT_CURLY() { return getToken(PythonG3Parser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(PythonG3Parser.RIGHT_CURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonG3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonG3Parser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonG3Listener ) ((PythonG3Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonG3Visitor ) return ((PythonG3Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			int _alt;
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
			case BREAK:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				simple_statement();
				}
				break;
			case LEFT_CURLY:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(231);
					match(NEWLINE);
					}
				}

				setState(234);
				match(LEFT_CURLY);
				setState(242); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(238);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(235);
							match(NEWLINE);
							}
							}
							setState(240);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(241);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(244); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(246);
					match(NEWLINE);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(RIGHT_CURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 5:
			return conjunction_sempred((ConjunctionContext)_localctx, predIndex);
		case 14:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 15:
			return mult_sempred((MultContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conjunction_sempred(ConjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mult_sempred(MultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003J\b\u0003"+
		"\u000b\u0003\f\u0003K\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004"+
		"\n\u0004\f\u0004Y\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006i\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007o\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bv\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0090\b\u000e\n\u000e\f\u000e\u0093\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00a1\b\u000f"+
		"\n\u000f\f\u000f\u00a4\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00b1\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ba"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00ca\b\u0014\n\u0014\f\u0014"+
		"\u00cd\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d2\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00e2\b\u0017\n\u0017\f\u0017"+
		"\u00e5\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00e9\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u00ed\b\u0018\n\u0018\f\u0018\u00f0\t\u0018"+
		"\u0001\u0018\u0004\u0018\u00f3\b\u0018\u000b\u0018\f\u0018\u00f4\u0001"+
		"\u0018\u0005\u0018\u00f8\b\u0018\n\u0018\f\u0018\u00fb\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00ff\b\u0018\u0001\u0018\u0000\u0004\b\n\u001c"+
		"\u001e\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0001\u0001\u0000\u001e\"\u010c"+
		"\u00006\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004C"+
		"\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bO\u0001\u0000"+
		"\u0000\u0000\nZ\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000e"+
		"n\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012w\u0001"+
		"\u0000\u0000\u0000\u0014z\u0001\u0000\u0000\u0000\u0016}\u0001\u0000\u0000"+
		"\u0000\u0018\u0080\u0001\u0000\u0000\u0000\u001a\u0083\u0001\u0000\u0000"+
		"\u0000\u001c\u0086\u0001\u0000\u0000\u0000\u001e\u0094\u0001\u0000\u0000"+
		"\u0000 \u00b0\u0001\u0000\u0000\u0000\"\u00b2\u0001\u0000\u0000\u0000"+
		"$\u00b9\u0001\u0000\u0000\u0000&\u00bb\u0001\u0000\u0000\u0000(\u00c0"+
		"\u0001\u0000\u0000\u0000*\u00d3\u0001\u0000\u0000\u0000,\u00da\u0001\u0000"+
		"\u0000\u0000.\u00de\u0001\u0000\u0000\u00000\u00fe\u0001\u0000\u0000\u0000"+
		"25\u0005*\u0000\u000035\u0003\u0002\u0001\u000042\u0001\u0000\u0000\u0000"+
		"43\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u00009:\u0005\u0000\u0000\u0001:\u0001\u0001\u0000\u0000\u0000"+
		";>\u0003\u0004\u0002\u0000<>\u0003$\u0012\u0000=;\u0001\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?D\u0003\"\u0011"+
		"\u0000@D\u0003\u0006\u0003\u0000AD\u0005\t\u0000\u0000BD\u0005\n\u0000"+
		"\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0005"+
		"*\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005-\u0000\u0000HJ\u0005"+
		"\u001a\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MN\u0003\b\u0004\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0006\u0004"+
		"\uffff\uffff\u0000PQ\u0003\n\u0005\u0000QW\u0001\u0000\u0000\u0000RS\n"+
		"\u0002\u0000\u0000ST\u0005\f\u0000\u0000TV\u0003\n\u0005\u0000UR\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z[\u0006\u0005\uffff\uffff\u0000[\\\u0003\f\u0006\u0000\\b\u0001"+
		"\u0000\u0000\u0000]^\n\u0002\u0000\u0000^_\u0005\u000b\u0000\u0000_a\u0003"+
		"\f\u0006\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000b\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000ef\u0005\r\u0000\u0000fi\u0003\f\u0006"+
		"\u0000gi\u0003\u000e\u0007\u0000he\u0001\u0000\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000i\r\u0001\u0000\u0000\u0000jk\u0003\u001c\u000e\u0000kl\u0003"+
		"\u0010\b\u0000lo\u0001\u0000\u0000\u0000mo\u0003\u001c\u000e\u0000nj\u0001"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u000f\u0001\u0000\u0000"+
		"\u0000pv\u0003\u0012\t\u0000qv\u0003\u0014\n\u0000rv\u0003\u0016\u000b"+
		"\u0000sv\u0003\u0018\f\u0000tv\u0003\u001a\r\u0000up\u0001\u0000\u0000"+
		"\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0011\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0018\u0000\u0000xy\u0003\u001c\u000e\u0000y\u0013\u0001\u0000"+
		"\u0000\u0000z{\u0005\u0019\u0000\u0000{|\u0003\u001c\u000e\u0000|\u0015"+
		"\u0001\u0000\u0000\u0000}~\u0005\u0016\u0000\u0000~\u007f\u0003\u001c"+
		"\u000e\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0017"+
		"\u0000\u0000\u0081\u0082\u0003\u001c\u000e\u0000\u0082\u0019\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\u0014\u0000\u0000\u0084\u0085\u0003\u001c"+
		"\u000e\u0000\u0085\u001b\u0001\u0000\u0000\u0000\u0086\u0087\u0006\u000e"+
		"\uffff\uffff\u0000\u0087\u0088\u0003\u001e\u000f\u0000\u0088\u0091\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\n\u0003\u0000\u0000\u008a\u008b\u0005\u000f"+
		"\u0000\u0000\u008b\u0090\u0003\u001e\u000f\u0000\u008c\u008d\n\u0002\u0000"+
		"\u0000\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u0090\u0003\u001e\u000f"+
		"\u0000\u008f\u0089\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u001d\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u000f\uffff"+
		"\uffff\u0000\u0095\u0096\u0003 \u0010\u0000\u0096\u00a2\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\n\u0004\u0000\u0000\u0098\u0099\u0005\u0011\u0000\u0000"+
		"\u0099\u00a1\u0003 \u0010\u0000\u009a\u009b\n\u0003\u0000\u0000\u009b"+
		"\u009c\u0005\u0012\u0000\u0000\u009c\u00a1\u0003 \u0010\u0000\u009d\u009e"+
		"\n\u0002\u0000\u0000\u009e\u009f\u0005\u0013\u0000\u0000\u009f\u00a1\u0003"+
		" \u0010\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000"+
		"\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u001f\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00b1\u0005-\u0000\u0000\u00a6\u00b1\u0005+\u0000\u0000"+
		"\u00a7\u00b1\u0005,\u0000\u0000\u00a8\u00b1\u0005\u0002\u0000\u0000\u00a9"+
		"\u00b1\u0005\u0001\u0000\u0000\u00aa\u00b1\u0005\u0003\u0000\u0000\u00ab"+
		"\u00b1\u0005(\u0000\u0000\u00ac\u00ad\u0005\u001b\u0000\u0000\u00ad\u00ae"+
		"\u0003\b\u0004\u0000\u00ae\u00af\u0005\u001c\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00a5\u0001\u0000\u0000\u0000\u00b0\u00a6\u0001"+
		"\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b1!\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005-\u0000"+
		"\u0000\u00b3\u00b4\u0007\u0000\u0000\u0000\u00b4\u00b5\u0003\b\u0004\u0000"+
		"\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00ba\u0003(\u0014\u0000\u00b7\u00ba"+
		"\u0003&\u0013\u0000\u00b8\u00ba\u0003*\u0015\u0000\u00b9\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba%\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\b\u0000"+
		"\u0000\u00bc\u00bd\u0003\b\u0004\u0000\u00bd\u00be\u0005\u001d\u0000\u0000"+
		"\u00be\u00bf\u00030\u0018\u0000\u00bf\'\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0004\u0000\u0000\u00c1\u00c2\u0003\b\u0004\u0000\u00c2\u00c3"+
		"\u0005\u001d\u0000\u0000\u00c3\u00cb\u00030\u0018\u0000\u00c4\u00c5\u0005"+
		"\u0006\u0000\u0000\u00c5\u00c6\u0003\b\u0004\u0000\u00c6\u00c7\u0005\u001d"+
		"\u0000\u0000\u00c7\u00c8\u00030\u0018\u0000\u00c8\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c4\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d1\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0005\u0000\u0000\u00cf\u00d0\u0005\u001d\u0000"+
		"\u0000\u00d0\u00d2\u00030\u0018\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2)\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0007\u0000\u0000\u00d4\u00d5\u0005-\u0000\u0000\u00d5\u00d6"+
		"\u0005\u000e\u0000\u0000\u00d6\u00d7\u0003,\u0016\u0000\u00d7\u00d8\u0005"+
		"\u001d\u0000\u0000\u00d8\u00d9\u00030\u0018\u0000\u00d9+\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005#\u0000\u0000\u00db\u00dc\u0003.\u0017\u0000\u00dc"+
		"\u00dd\u0005$\u0000\u0000\u00dd-\u0001\u0000\u0000\u0000\u00de\u00e3\u0003"+
		" \u0010\u0000\u00df\u00e0\u0005%\u0000\u0000\u00e0\u00e2\u0003 \u0010"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4/\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e6\u00ff\u0003\u0004\u0002\u0000\u00e7\u00e9\u0005*\u0000\u0000\u00e8"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00f2\u0005&\u0000\u0000\u00eb\u00ed"+
		"\u0005*\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0003\u0002\u0001\u0000\u00f2\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0005*\u0000\u0000\u00f7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\'\u0000"+
		"\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00e6\u0001\u0000\u0000"+
		"\u0000\u00fe\u00e8\u0001\u0000\u0000\u0000\u00ff1\u0001\u0000\u0000\u0000"+
		"\u001846=CKWbhnu\u008f\u0091\u00a0\u00a2\u00b0\u00b9\u00cb\u00d1\u00e3"+
		"\u00e8\u00ee\u00f4\u00f9\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}