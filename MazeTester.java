
public class MazeTester {

	public static void main(String[] args) {
		boolean[][] one=new boolean[2][2];
		one[0][0]=false;
		one[0][1]=false;
		one[1][0]=false;
		one[1][1]=false;
		Maze maze=new Maze(one,new MazeCoord(0,0),new MazeCoord(1,1));
        System.out.println(maze.search());
        System.out.println(maze.getPath());
	}
}
