/* Generated By:JJTree: Do not edit this line. ASTterme.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTterme extends SimpleNode {
  public ASTterme(int id) {
    super(id);
  }

  public ASTterme(ExampleParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExampleParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7f564c2f990f709b6a5fcaad5ad4ac88 (do not edit this line) */
