public class mainDFS {
    
        Main point = new Main(9);
        point.setLabel(0, "A");
        point.setLabel(1, "B");
        point.setLabel(2, "C");
        point.setLabel(3, "D");
        point.setLabel(4, "E"); 
        point.setLabel(5, "F");
        point.setLabel(6, "G");
        point.setLabel(7, "H");
        point.setLabel(8, "I");
        point.addEdge(0, 1);
        point.addEdge(0, 3);
        point.addEdge(0, 4);
        point.addEdge(1, 4);
        point.addEdge(3, 6);
        point.addEdge(4, 5);
        point.addEdge(4, 7); 
        point.addEdge(6, 7);
        point.addEdge(5, 2);
        point.addEdge(5, 7);
        point.addEdge(7, 8);
        point.addEdge(2, 1);
        point.addEdge(8, 5);
        System.out.println("The original graph is as follows: \n");
        point.print();
        System.out.println("\nThe depth-first traversal is:");
        point.DFS();
 }

