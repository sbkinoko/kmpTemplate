package usecase

import AppModule
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.inject
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GoodMorningUseCaseTest : KoinTest {
    private val useCase: GoodMorningUseCase by inject()

    @BeforeTest
    fun beforeTest() {
        startKoin {
            modules(
                AppModule,
            )
        }
    }

    @AfterTest
    fun afterTest() {
        stopKoin()
    }

    @Test
    fun checkValue() {
        assertEquals(
            "Good Morning",
            useCase.invoke(),
        )
    }
}
