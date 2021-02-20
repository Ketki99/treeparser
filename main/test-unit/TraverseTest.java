import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import pojo.Floor;
import pojo.Node;
import pojo.Room;
import pojo.Switch;
import service.Traverse;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@RunWith(JUnit4ClassRunner.class)
public class TraverseTest {

    Node tree;

    @Before
    public void init(){

        Node _switch = new Switch();
        _switch.setName("S1");

        Node room = new Room();
        room.setName("R1");
        room.addChild(_switch);

        Node floor = new Floor();
        floor.setName("F1");
        floor.addChild(room);

        tree = floor;
    }

    @Test
    public void accessTo_One_Node_Per_Level(){

        Set<Node> expected = new LinkedHashSet<>();
        expected.add(tree);
        expected.add(tree.getChild().get(0));
        expected.add(tree.getChild().get(0).getChild().get(0));

        Traverse traverse = new Traverse();
        Assert.assertEquals(expected,traverse.accessTo(tree));

    }

}
