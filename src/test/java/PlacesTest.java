import org.junit.*;
import static org.junit.Assert.*;

public class PlacesTest {

  @Test
  public void newPlaces_instanttiatesCorrectly() {
    Places newPlaces = new Places("test");
    assertEquals(true, newPlaces instanceof Places);
  }

  @Test
  public void newPlaces_returnNameOfPlace() {
    Places newPlaces = new Places("test");
    assertEquals("test", newPlaces.getPlace());
  }
}
