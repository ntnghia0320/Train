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
        void init() {
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
            void init() {
                queue.enqueue("1");
                queue.enqueue("2");
            }

            @Test
            void test_isEmpty() {
                assertFalse(queue.isEmpty());
            }

            @Test
            void test_dequeue() {
                assertEquals("1", queue.dequeue());
                assertEquals("2", queue.dequeue());
                assertTrue(queue.isEmpty());
            }

            @Nested
            class TestPeek {
                @BeforeEach
                void init() {
                    queue.enqueue("1");
                }

                @Test
                void test_peek() {
                    assertEquals("1", queue.peek());
                    assertFalse(queue.isEmpty());
                }
            }
        }
    }
}
