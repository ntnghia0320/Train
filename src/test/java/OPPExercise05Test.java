import OPPExercise05.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OPPExercise05Test<T> {
    Queue<String> queue;

    @Nested
    class WhenNew {

        @BeforeEach
        void innit() {
            queue = new Queue<>();
        }

        @Test
        void test_isEmpty() {
            assertTrue(queue.isEmpty());
        }

        @Test
        void test_dequeue() {
            assertThrows(RuntimeException.class, queue::dequeue);
        }

        @Test
        void test_peek() {
            assertThrows(RuntimeException.class, queue::peek);
        }

        @Nested
        class AfterAdd {

            @BeforeEach
            void innit() {
                queue.enqueue("1");
            }

            @Test
            void test_isEmpty() {
                assertFalse(queue.isEmpty());
            }

            @Test
            void test_peek() {
                assertEquals("1", queue.peek());
                assertFalse(queue.isEmpty());
            }

            @Test
            void test_dequeue() {
                assertEquals("1", queue.dequeue());
                assertTrue(queue.isEmpty());
            }
        }
    }
}
