/* Generated By:JJTree: Do not edit this line. ASTfacteur.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTfacteur extends SimpleNode {
  public ASTfacteur(int id) {
    super(id);
  }

  public ASTfacteur(ExampleParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExampleParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=49048a2bd992808ae50d38d0eee709b9 (do not edit this line) */
