package repository

import repository.greeting.GoodMorningRepository
import repository.greeting.GreetingRepository
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GoodMorningRepositoryTest {
    private lateinit var repository: GreetingRepository

    @BeforeTest
    fun beforeTest() {
        repository = GoodMorningRepository()
    }

    @Test
    fun checkValue() {
        assertEquals(
            "Good Morning",
            repository.greeting(),
        )
    }
}
