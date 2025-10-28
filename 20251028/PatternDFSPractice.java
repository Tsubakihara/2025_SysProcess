// ============================================
// ファイル名: PatternDFSPractice.java
// ============================================

public class PatternDFSPractice {

    public static void main(String[] args) {

        System.out.println("--------------------------------");

        // ===============================
        // 問題1：文字列パターンマッチング（contains）
        String text = "I love Java";
        String pattern = "Java";

        if (text.___(pattern)) { // ← pattern が含まれるか判定
            System.out.println("1. パターンあり");
        } else {
            System.out.println("1. パターンなし");
        }

        // ===============================
        // 問題2：配列内検索
        int[] arr = {10, 20, 30, 40};
        int target = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ___ target) { // ← 要素がターゲットと一致するか
                found = true;
                break;
            }
        }
        System.out.println("2. 配列にターゲットあり: " + found);

        // ===============================
        // 問題3：文字列置換（replace）
        String msg = "Hello Python";
        String newMsg = msg.___("Python", "Java"); // ← "Python"を"Java"に置換
        System.out.println("3. 置換後: " + newMsg);

        // ===============================
        // 問題4：グラフDFS
        int[][] graph = {
            {0, 1, 0, 0},
            {1, 0, 1, 1},
            {0, 1, 0, 0},
            {0, 1, 0, 0}
        };
        boolean[] visited = new boolean[4];
        System.out.print("4. DFS順序: ");
        dfs(graph, visited, ___); // ← 始点を入力
        System.out.println();

        // ===============================
        // 問題5：迷路DFS
        int[][] maze = {
            {0, 1, 0},
            {0, 0, 0},
            {1, 0, 1}
        };
        boolean[][] visitedMaze = new boolean[3][3];
        System.out.println("5. 迷路DFS開始");
        dfsMaze(maze, visitedMaze, 0, 0);

        System.out.println("--------------------------------");
        System.out.println("※ ___ を埋めて正しい出力を得ましょう。");
    }

    // ===============================
    // DFS for graph
    public static void dfs(int[][] graph, boolean[] visited, int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && ___) { // ← 未訪問なら再帰
                dfs(graph, visited, i);
            }
        }
    }

    // DFS for 2D maze
    public static void dfsMaze(int[][] maze, boolean[][] visited, int x, int y) {
        if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length) return;
        if (maze[x][y] == 1 || visited[x][y]) return;
        visited[x][y] = true;
        System.out.println("訪問: (" + x + "," + y + ")");
        dfsMaze(maze, visited, x+1, y);
        dfsMaze(maze, visited, x-1, y);
        dfsMaze(maze, visited, x, y+1);
        dfsMaze(maze, visited, x, y-1);
    }
}
