/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author w206113903
 */
import com.mycompany.servicea1.SeriousComponent;
import junit.framework.TestCase;

public class SeriousComponentTest extends TestCase {

        public SeriousComponentTest(String name) {
                super( name );
        }

        public void testSeriousness() throws Exception {
                assertTrue( SeriousComponent.testSeriousness( "SAD" ) );
                assertTrue( SeriousComponent.testSeriousness( "SERIOUS" ) );
                assertTrue( SeriousComponent.testSeriousness( "CRAZY" ) );
                assertTrue( !SeriousComponent.testSeriousness( "FUNNY" ) );
        }
}