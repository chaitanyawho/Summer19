/* https://www.youtube.com/watch?v=RpgcYiky7uw
this algorithm is to get all the strongly connected graphs in a graph 
time complexity being only O(v+E)
it has to go through dfs twice once to calculate finnish times and the reverse the graph
the require ment to reverese is beacause
 when you grpup all the strongly connected components together you get an acyclic graph, i.e
only one edge connecting form that commponent to the rest of the graph now that 
 also means that one vertex of the ssc will come after the edge exploration of the acyclic edge
 so for that reason we reverse the graph and then go through the dfs */

public class Kosaraju 
{

}