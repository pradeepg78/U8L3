public class Array2DAlgorithmTester
{
    public static void main(String[] args)
    {
        String[][] xoGrid = Algorithm2DArrays.gridOfXandO(7);

        for (String[] row : xoGrid)
        {
            for (String val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}






