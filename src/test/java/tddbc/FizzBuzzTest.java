package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void _1を渡すと文字列1を返す() throws Exception {
        // 準備 arange or given
        FizzBuzz fizzbuzz = new FizzBuzz();
        // 実行 act or when
        // 検証 assert or then
        assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    void _2を渡すと文字列2を返す() throws Exception {
        // 準備 arange or given
        FizzBuzz fizzbuzz = new FizzBuzz();
        // 実行 act or when
        // 検証 assert or then
        assertEquals("2", fizzbuzz.convert(2));
    }
}
