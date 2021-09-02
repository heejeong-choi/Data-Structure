package fastcampus.findpaths;

public class ShortestPath {
    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph(6);

        myGraph.addEdges(0,1,1);
        myGraph.addEdges(0, 2,4);
        myGraph.addEdges(1,2,2);
        myGraph.addEdges(2,3,1);
        myGraph.addEdges(3,4,8);
        myGraph.addEdges(3,5,3);
        myGraph.addEdges(4,5,4);

        myGraph.calcShotestPath(0);
        myGraph.showDistance(0);

    }
}
