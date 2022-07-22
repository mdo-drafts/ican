package solved.p_11_graphs.nc081_M_02_133_Clone_Graph.myi_01;

import common.graphs.lc_133_clone_graph.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n2);
        n3.neighbors.add(n4);

        n4.neighbors.add(n3);
        n4.neighbors.add(n1);

        Node node = sut.cloneGraph(n1);

        assertEquals(node, n1);

    }



}