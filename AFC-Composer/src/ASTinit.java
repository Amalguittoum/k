/* Generated By:JJTree: Do not edit this line. ASTinit.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTinit extends SimpleNode {
  public ASTinit(int id) {
    super(id);
  }

  public ASTinit(ExampleParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExampleParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=aaf93118caa0d40fcf87a6659a38dc8c (do not edit this line) */
