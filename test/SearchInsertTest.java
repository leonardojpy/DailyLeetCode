import SearchInsertPosition.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SearchInsertTest {
    @Test
    public void deveFuncionarCorretamente(){
        Solution solution = new Solution();
        int[] myArray = {1,3,5,6};


        int resultadoEsperado = solution.searchInsert(myArray, 5);

        Assert.assertEquals(2, resultadoEsperado);

    }
}
