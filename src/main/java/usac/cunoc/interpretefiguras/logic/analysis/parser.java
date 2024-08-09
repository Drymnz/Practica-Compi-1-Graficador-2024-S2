
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package usac.cunoc.interpretefiguras.logic.analysis;

import java.util.ArrayList;
import java_cup.runtime.*;
import usac.cunoc.interpretefiguras.logic.objectAnalysis.Token;
import usac.cunoc.interpretefiguras.logic.reports.ReportErrorInterpreter;
import usac.cunoc.interpretefiguras.logic.reports.TypeIntreprete;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\004\000\002\002\003\000\002\002" +
    "\002\000\002\005\004\000\002\005\003\000\002\007\004" +
    "\000\002\007\003\000\002\010\016\000\002\010\016\000" +
    "\002\010\020\000\002\010\020\000\002\010\022\000\002" +
    "\006\017\000\002\012\003\000\002\012\003\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\004\003\000\002" +
    "\003\005\000\002\003\005\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\162\000\010\002\uffff\033\004\034\007\001\002\000" +
    "\014\026\051\027\052\030\050\031\047\032\053\001\002" +
    "\000\010\002\000\033\004\034\007\001\002\000\010\002" +
    "\ufffb\033\ufffb\034\ufffb\001\002\000\004\036\013\001\002" +
    "\000\010\002\ufffd\033\ufffd\034\ufffd\001\002\000\004\002" +
    "\012\001\002\000\004\002\001\001\002\000\004\035\014" +
    "\001\002\000\004\013\015\001\002\000\006\027\017\037" +
    "\020\001\002\000\004\012\021\001\002\000\004\012\ufff4" +
    "\001\002\000\004\012\ufff3\001\002\000\006\010\024\013" +
    "\023\001\002\000\004\012\040\001\002\000\006\010\024" +
    "\013\023\001\002\000\016\004\uffe3\005\uffe3\006\uffe3\007" +
    "\uffe3\012\uffe3\014\uffe3\001\002\000\014\004\030\005\031" +
    "\006\026\007\027\012\uffe9\001\002\000\006\010\024\013" +
    "\023\001\002\000\006\010\024\013\023\001\002\000\006" +
    "\010\024\013\023\001\002\000\006\010\024\013\023\001" +
    "\002\000\016\004\uffe7\005\uffe7\006\026\007\027\012\uffe7" +
    "\014\uffe7\001\002\000\016\004\uffe8\005\uffe8\006\026\007" +
    "\027\012\uffe8\014\uffe8\001\002\000\016\004\uffe5\005\uffe5" +
    "\006\uffe5\007\uffe5\012\uffe5\014\uffe5\001\002\000\016\004" +
    "\uffe6\005\uffe6\006\uffe6\007\uffe6\012\uffe6\014\uffe6\001\002" +
    "\000\014\004\030\005\031\006\026\007\027\014\037\001" +
    "\002\000\016\004\uffe4\005\uffe4\006\uffe4\007\uffe4\012\uffe4" +
    "\014\uffe4\001\002\000\006\010\024\013\023\001\002\000" +
    "\004\012\042\001\002\000\006\010\024\013\023\001\002" +
    "\000\004\012\044\001\002\000\004\014\045\001\002\000" +
    "\010\002\ufff5\033\ufff5\034\ufff5\001\002\000\010\002\ufffe" +
    "\033\ufffe\034\ufffe\001\002\000\004\013\150\001\002\000" +
    "\004\013\131\001\002\000\004\013\116\001\002\000\004" +
    "\013\101\001\002\000\004\013\055\001\002\000\010\002" +
    "\ufffc\033\ufffc\034\ufffc\001\002\000\004\011\056\001\002" +
    "\000\004\012\057\001\002\000\006\010\024\013\023\001" +
    "\002\000\004\012\061\001\002\000\006\010\024\013\023" +
    "\001\002\000\004\012\063\001\002\000\006\010\024\013" +
    "\023\001\002\000\004\012\065\001\002\000\024\015\070" +
    "\016\074\017\072\020\066\021\077\022\075\023\067\024" +
    "\073\025\076\001\002\000\004\014\uffef\001\002\000\004" +
    "\014\uffec\001\002\000\004\014\ufff2\001\002\000\004\014" +
    "\100\001\002\000\004\014\ufff0\001\002\000\004\014\uffeb" +
    "\001\002\000\004\014\ufff1\001\002\000\004\014\uffed\001" +
    "\002\000\004\014\uffea\001\002\000\004\014\uffee\001\002" +
    "\000\010\002\ufff9\033\ufff9\034\ufff9\001\002\000\004\011" +
    "\102\001\002\000\004\012\103\001\002\000\006\010\024" +
    "\013\023\001\002\000\004\012\105\001\002\000\006\010" +
    "\024\013\023\001\002\000\004\012\107\001\002\000\006" +
    "\010\024\013\023\001\002\000\004\012\111\001\002\000" +
    "\006\010\024\013\023\001\002\000\004\012\113\001\002" +
    "\000\024\015\070\016\074\017\072\020\066\021\077\022" +
    "\075\023\067\024\073\025\076\001\002\000\004\014\115" +
    "\001\002\000\010\002\ufff7\033\ufff7\034\ufff7\001\002\000" +
    "\004\011\117\001\002\000\004\012\120\001\002\000\006" +
    "\010\024\013\023\001\002\000\004\012\122\001\002\000" +
    "\006\010\024\013\023\001\002\000\004\012\124\001\002" +
    "\000\006\010\024\013\023\001\002\000\004\012\126\001" +
    "\002\000\024\015\070\016\074\017\072\020\066\021\077" +
    "\022\075\023\067\024\073\025\076\001\002\000\004\014" +
    "\130\001\002\000\010\002\ufffa\033\ufffa\034\ufffa\001\002" +
    "\000\004\011\132\001\002\000\004\012\133\001\002\000" +
    "\006\010\024\013\023\001\002\000\004\012\135\001\002" +
    "\000\006\010\024\013\023\001\002\000\004\012\137\001" +
    "\002\000\006\010\024\013\023\001\002\000\004\012\141" +
    "\001\002\000\006\010\024\013\023\001\002\000\004\012" +
    "\143\001\002\000\006\010\024\013\023\001\002\000\004" +
    "\012\145\001\002\000\024\015\070\016\074\017\072\020" +
    "\066\021\077\022\075\023\067\024\073\025\076\001\002" +
    "\000\004\014\147\001\002\000\010\002\ufff6\033\ufff6\034" +
    "\ufff6\001\002\000\004\011\151\001\002\000\004\012\152" +
    "\001\002\000\006\010\024\013\023\001\002\000\004\012" +
    "\154\001\002\000\006\010\024\013\023\001\002\000\004" +
    "\012\156\001\002\000\006\010\024\013\023\001\002\000" +
    "\004\012\160\001\002\000\006\010\024\013\023\001\002" +
    "\000\004\012\162\001\002\000\024\015\070\016\074\017" +
    "\072\020\066\021\077\022\075\023\067\024\073\025\076" +
    "\001\002\000\004\014\164\001\002\000\010\002\ufff8\033" +
    "\ufff8\034\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\162\000\012\002\010\005\004\006\005\007\007\001" +
    "\001\000\004\010\053\001\001\000\006\006\005\007\045" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\003\024" +
    "\004\021\001\001\000\002\001\001\000\004\003\035\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\003\034" +
    "\001\001\000\004\003\033\001\001\000\004\003\032\001" +
    "\001\000\004\003\031\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\003\024\004\040\001\001" +
    "\000\002\001\001\000\006\003\024\004\042\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\003\024\004" +
    "\057\001\001\000\002\001\001\000\006\003\024\004\061" +
    "\001\001\000\002\001\001\000\006\003\024\004\063\001" +
    "\001\000\002\001\001\000\004\011\070\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\024\004\103\001\001\000\002\001\001\000\006\003" +
    "\024\004\105\001\001\000\002\001\001\000\006\003\024" +
    "\004\107\001\001\000\002\001\001\000\006\003\024\004" +
    "\111\001\001\000\002\001\001\000\004\011\113\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\003\024\004\120\001\001\000\002" +
    "\001\001\000\006\003\024\004\122\001\001\000\002\001" +
    "\001\000\006\003\024\004\124\001\001\000\002\001\001" +
    "\000\004\011\126\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\003\024" +
    "\004\133\001\001\000\002\001\001\000\006\003\024\004" +
    "\135\001\001\000\002\001\001\000\006\003\024\004\137" +
    "\001\001\000\002\001\001\000\006\003\024\004\141\001" +
    "\001\000\002\001\001\000\006\003\024\004\143\001\001" +
    "\000\002\001\001\000\004\011\145\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\024\004\152\001\001\000\002\001\001\000" +
    "\006\003\024\004\154\001\001\000\002\001\001\000\006" +
    "\003\024\004\156\001\001\000\002\001\001\000\006\003" +
    "\024\004\160\001\001\000\002\001\001\000\004\011\162" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public parser(Lexema lexer) {
        super(lexer);
    }

    private void printlnInter(String a){
         System.out.println(a);
    }

    private ArrayList<ReportErrorInterpreter> listError = new ArrayList();
  
    private void addError(){
        TypeIntreprete type = TypeIntreprete.LEXICON;
        System.out.println("\n"+" - Clase<"+"> en simbolo<" + sym.terminalNames[cur_token.sym]+String.format(">posicion: <%d>, <%d>", (cur_token.left+1), (cur_token.right+1)));
        Token toke = new Token((cur_token.left+1), (cur_token.right+1), sym.terminalNames[cur_token.sym]);
        String description = ListErrorAnalyzer.LEXEMA_ONE.getDescription();
        this.listError.add(new ReportErrorInterpreter(type, toke, description));
    }
    public void syntax_error(Symbol cur_token) {
        addError();
    }
    public ArrayList<ReportErrorInterpreter> getListError() {
        return this.listError;
    }
    /**
     * ***END CODE*******
     */


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= acciones 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // acciones ::= acciones grafica 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("acciones",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // acciones ::= grafica 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("acciones",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // grafica ::= GRAFICAR tipo_grafica 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("grafica",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // grafica ::= animtion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("grafica",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tipo_grafica ::= CIRCLE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C 
            {
              Object RESULT =null;
		int pxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int pxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object px = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int pyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int pyright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object py = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object r = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_grafica",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // tipo_grafica ::= SQUARE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C 
            {
              Object RESULT =null;
		int pxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int pxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object px = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int pyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int pyright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object py = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_grafica",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // tipo_grafica ::= RECTANGLE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C 
            {
              Object RESULT =null;
		int pxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int pxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		Object px = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int pyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int pyright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object py = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object w = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int hleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object h = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_grafica",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-13)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // tipo_grafica ::= LINE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C 
            {
              Object RESULT =null;
		int pxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int pxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		Object px = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int pyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int pyright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object py = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int px2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int px2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object px2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int py2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int py2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object py2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_grafica",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-13)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // tipo_grafica ::= POLYGON PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C 
            {
              Object RESULT =null;
		int pxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).left;
		int pxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).right;
		Object px = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-11)).value;
		int pyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int pyright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		Object py = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object w = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int hleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object h = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_grafica",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-15)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // animtion ::= ANIMATION OBJECT LAST PARENTESIS_A tipo_animation COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA PARENTESIS_C 
            {
              Object RESULT =null;
		int dxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int dxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object dx = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int dyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int dyright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object dy = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("animtion",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // tipo_animation ::= LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_animation",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // tipo_animation ::= CURVE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_animation",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // tipo_color ::= BLUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // tipo_color ::= RED 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // tipo_color ::= YELLOW 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // tipo_color ::= GREEN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // tipo_color ::= BLACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // tipo_color ::= CYAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // tipo_color ::= FUCHSIA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // tipo_color ::= LAVENDER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // tipo_color ::= MAROON 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_color",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // inico_opereacion ::= operacion 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = a;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inico_opereacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // operacion ::= operacion SUMAR operacion 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // operacion ::= operacion RESTAR operacion 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // operacion ::= operacion DIVIDIR operacion 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // operacion ::= operacion MULTIPLICAR operacion 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // operacion ::= PARENTESIS_A operacion PARENTESIS_C 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // operacion ::= REAL_NUMEBERS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
