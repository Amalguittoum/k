/* Generated By:JJTree: Do not edit this line. ASTaction.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTaction extends SimpleNode {
  public ASTaction(int id) {
    super(id);
  }

  public ASTaction(ExampleParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExampleParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4282cd10f962ce1db5a139ba1bb7443d (do not edit this line) */
