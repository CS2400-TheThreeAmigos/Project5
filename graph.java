import java.util.;
import java.io.;
public class Main<E>
{
    private boolean[][] edges; 
    private E[] labels;
    private boolean[] visited;
    public Main(int n) 
    {

        edges = new boolean[n][n];
        labels = (E[]) new Object[n];
    } 
    public void setLabel(int vertex, E label) 
    {
        labels[vertex] = label;
    }
    public E getLabel(int vertex) 
    {
        return labels[vertex];
    }
   public int size() 
   {
        return edges.length;
   }
   public void addEdge(int source, int target) 
   {
        edges[source][target] = true;
   }
   public boolean isEdge(int source, int target) 
   {
        return edges[source][target];
   }
   public void removeEdge(int source, int target) 
   {
        edges[source][target] = false;
   }
   public int[] neighbors(int vertex) 
   {
        int count = 0;
        for (int i = 0; i < edges[vertex].length; i++) 
        {
            if (edges[vertex][i])
                count++;
        }
        int[] answer = new int[count];
        count = 0;
        for (int i = 0; i < edges[vertex].length; i++) 
        {
            if (edges[vertex][i])
                answer[count++] = i;
        }
        return answer;
    }

    public void print() 
    {
        for (int p = 0; p < edges.length; p++) 
        {

            for (int i = 0; i < edges[p].length; i++) 
            {
                if (edges[p][i])
                    System.out.print(labels[p] + " -> "+ labels[i] + " ");
            }
            System.out.println();
        }
    }
    public int getUnvisitedNeighbor(int vertex, boolean[] visited) 
    {
        for (int i = 0; i < edges[vertex].length; i++) 
        {
            if (edges[vertex][i] && visited[i] == false)
               return i;
        }
        return -1;
    }

    Public boolean hasNext(int vertex)
    {
        if(vertex.getUnvisistedNeighbor() == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void DFS() 
    {
        int point = 0;
        boolean visitPoint[] = new boolean[edges.length];
        Stack<Integer> stack = new Stack<Integer>();
        visitPoint[point]= true;
        System.out.print("\n" + labels[point] + " ");
        stack.push(point);
        while (!stack.isEmpty()) 
        {
            int neighbor = getUnvisitedNeighbor(stack.peek(),visitPoint);
            if (neighbor == -1) 
            {
               stack.pop();
            } 
            else 
            {
                visitPoint[neighbor] = true;
                System.out.print(labels[neighbor] + " ");
                stack.push(neighbor);
           }
        }
        System.out.println();
    }
    public void BFS() 
    {
        int point = 0;
        boolean visitPoint[] = new boolean[edges.length];
        Stack<Integer> stack = new Stack<Integer>();
        visitPoint[point]= true;
        System.out.print("\n" + labels[point] + " ");
        stack.push(point);
        while(!stack.isEmpty())
        {
            int currentPoint= stack.pop();
            int neighbor=getUnvisitedNeighbor(currentPoint, visited[currentPoint]);
            while(neighbor!=-1)
            {
                visitedbfs[neighbor]=true;
                System.out.print(labels[neighbor] + " ");
                stack.push(neighbor);
            }
        }
    }
    public void BFS() 
    {
        int point = 0;
        boolean visitPoint[] = new boolean[edges.length];
        Stack<Integer> stack = new Stack<Integer>();
        visitPoint[point]= true;
        System.out.print("\n" + labels[point] + " ");
        stack.push(point);
        while (!stack.isEmpty()) 
        {
            int neighbor = getUnvisitedNeighbor(stack.peek(),visitPoint);
            for(int n : neighbors(stack.peek())
            {
                if(hasNext(n))
                {
                    visitPoint[n] = true;
                    System.out.print(labels[n] + " ");
                    stack.push(n);
                }
                else
                {
                    stack.pop();
                }
            }
        }
        System.out.println();
    }
}
