/* Generated By:JJTree: Do not edit this line. ASTevt.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTevt extends SimpleNode {
  public ASTevt(int id) {
    super(id);
  }

  public ASTevt(ExampleParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExampleParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c3527e977ea9bb1a03602f3e3c8d0174 (do not edit this line) */
