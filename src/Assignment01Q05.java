import java.util.Arrays;

public class Assignment01Q05 {
    public static int BFS(int[][] m, int i, int j)
    {
        boolean [] visited = new boolean[m.length];
        visited[i] = true;
        int [] next = new int[m.length];
        next[0] = i;
        int index2 = 0;
        int [] parent = new int[m.length];
        int [] distance = new int[m.length];
        distance[i] = 0;
        int index = 1;
        while (index2 < index)
        {
            int current = next[index2];
            for (int k=0; k<m.length; k++)
            {
                if (m[current][k] == 1 && !visited[k])
                {
                    parent[k] = current;
                    distance[k] = distance[current] + 1;
                    if (k==j)
                    {
                        return distance[k];
                    }
                    next[index] = k;
                    visited[k] = true;
                    index++;
                }
            }
            index2++;
        }
        return -1;
    }
    public static int findShortestPath(int[][] m, int i, int j) 
    {
        if (i == j) return 0;
        else
        {
            return BFS(m, i, j);
        }
    }



    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}