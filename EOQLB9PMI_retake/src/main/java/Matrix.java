import java.util.ArrayList;
public class Matrix
{
    public static int minimum(int[][] matrix)
    {
        int minimum = matrix[0][0];
        for (int r = 0; r < matrix.length; r++)
        {
            for (int c = 0; c < matrix[r].length; c++)
            {
                if (matrix[r][c] < minimum)
                {
                    minimum = matrix[r][c];
                }
            }
        }
        return minimum;
    }

    public static ArrayList<Integer> numbersDivisibleByThree(int[][] matrix)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++)
        {
            for (int c = 0; c < matrix[r].length; c++)
            {
                if (matrix[r][c] % 3 == 0)
                {
                    if (!nums.contains(matrix[r][c]))
                    {
                        nums.add(matrix[r][c]);
                    }
                }
            }
        }
        return nums;
    }
}