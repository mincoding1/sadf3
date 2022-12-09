import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PrintTest {

    @Mock
    public ArrayList<String> mockList;

    @Test
    public void getX() {
        Mockito.when(mockList.size()).thenReturn(100);
        assertEquals(100,mockList.size());
    }
}