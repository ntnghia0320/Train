import OOPExercise04.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OOPExercise04Test {
    Stack<String> stack;

    @Nested
    class WhenNew {

        @BeforeEach
        void innit() {
            stack = new Stack<String>(3);
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
            void push() {
                stack.push("ele1");
            }

            @Test
            void test_isEmpty() {
                assertFalse(stack.isEmpty());
            }

            @Test
            void test_pop() {
                assertEquals("ele1", stack.pop());
                assertTrue(stack.isEmpty());
            }

            @Test
            void test_peek() {
                assertEquals("ele1", stack.peek());
                assertFalse(stack.isEmpty());
            }
        }
    }
}