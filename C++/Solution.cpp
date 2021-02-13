#include <iostream>
#include <vector>
#include <unordered_map>
#include <queue>
#define INF INT_MAX
using namespace std;
void dfs(vector<pair<int,int>> adjList[], bool visited[], int i){
    for(auto next : adjList[i]){
        if(visited[i])
            return;
        visited[i] = true;
        cout << next.first << endl;
        dfs(adjList, visited, i + 1);
    }
}
void bfs(vector<pair<int, int>> adjList[], bool visited[], int i){
    queue<int> queue;
    queue.push(i);
    while(!queue.empty())
    {
        int index = queue.front();
        queue.pop();
        visited[index] = true;
        for(auto node : adjList[index])
        {
            if(!visited[node.first])
                queue.push(node.first);
        }
        cout << index << endl;
    }

}
int belmanFord(vector<tuple<int, int, int>> edges, int n){
    int distance[n] = {INF};

    return 0;
}
int main(void)
{
    vector<pair<int,int>> adjList[6];
    vector<tuple<int, int, int>> edges;
    adjList[0].push_back({1, 0});
    adjList[1].push_back({2,5});    
    adjList[1].push_back({4,3});
    adjList[2].push_back({3,7});
    adjList[2].push_back({4, 6});
    adjList[3].push_back({4,5});
    adjList[4].push_back({1, 2});
    edges.push_back({1,2,5});
    edges.push_back({1,3,3});
    edges.push_back({1,4,7});
    edges.push_back({2,5,2});
    edges.push_back({2,4,3});
    edges.push_back({4,5,2});
    bool visited[6] = {false};
    dfs(adjList, visited, 0);
    bool visited1[6] = {false};
    bfs(adjList, visited1, 1);
    belmanFord(edges, 5);
    return 0;
}
