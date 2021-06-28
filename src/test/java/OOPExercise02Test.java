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
        void init() {
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
            void init() {
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

            @Nested
            class TestPeek {
                @BeforeEach
                void init() {
                    stack.push(1);
                }

                @Test
                void test_peek() {
                    assertEquals(1, stack.peek());
                    assertFalse(stack.isEmpty());
                }
            }
        }
    }
}
