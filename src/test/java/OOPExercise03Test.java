import OOPExercise03.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OOPExercise03Test {
    Queue queue;

    @Nested
    class WhenNew {

        @BeforeEach
        void innit() {
            queue = new Queue();
        }

        @Test
        void test_isEmpty() {
            assertTrue(queue.isEmpty());
        }

        @Test
        void test_poll() {
            assertThrows(RuntimeException.class, queue::poll);
        }

        @Test
        void test_peek() {
            assertThrows(RuntimeException.class, queue::peek);
        }

        @Nested
        class AfterAdd {

            @BeforeEach
            void innit() {
                queue.add(1);
            }

            @Test
            void test_isEmpty() {
                assertFalse(queue.isEmpty());
            }

            @Test
            void test_peek() {
                assertEquals(1, queue.peek());
                assertFalse(queue.isEmpty());
            }

            @Test
            void test_poll() {
                assertEquals(1, queue.poll());
                assertTrue(queue.isEmpty());
            }
        }
    }
}