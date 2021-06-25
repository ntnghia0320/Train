import OPPExcercise02.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OOPExercise02Test {
    Stack stack;

    @Nested
    class WhenNew {

        @BeforeEach
        void innit() {
            stack = new Stack();
        }

        @Test
        void test_isEmpty() {
            assertTrue(stack.isEmpty());
        }

        @Test
        void test_pop() {
            assertThrows(RuntimeException.class, stack::pop);
        }

        @Test
        void test_peek() {
            assertThrows(RuntimeException.class, stack::peek);
        }

        @Nested
        class AfterPushing {

            @BeforeEach
            void test_push() {
                stack.push(1);
                stack.push(2);
            }

            @Test
            void test_isEmpty() {
                assertFalse(stack.isEmpty());
            }

            @Test
            void test_pop() {
                assertEquals(2, stack.pop());
                assertEquals(1, stack.pop());
                assertTrue(stack.isEmpty());
            }

            @Test
            void test_peek() {
                assertEquals(2, stack.peek());
                assertFalse(stack.isEmpty());
            }
        }
    }
}
