package  asu.dans;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;


/**
 * @author Dhanya Jacob
 *
 */
public class Function {

    private String id;
    private List<String> identifiers;
    private CommonTree code;
    private Scope scope;

    /**
     * @param i
     * @param ids
     * @param block
     */
    public Function(String i, CommonTree ids, CommonTree block) {
        id = i;
        identifiers = toList(ids);
        code = block;
        scope = new Scope();
    }

    /**
     * @param original
     */
    public Function(Function original) {
        this.id = original.id;
        this.identifiers = original.identifiers;
        this.code = original.code;
        this.scope = original.scope.copy();
    }


    /**
     * @param tree
     * @return
     */
    private List<String> toList(CommonTree tree) {
        List<String> ids = new ArrayList<String>();
        for(int i = 0; i < tree.getChildCount(); i++) {
            CommonTree child = (CommonTree)tree.getChild(i);
            ids.add(child.getText());
        }
        return ids;
    }
}
