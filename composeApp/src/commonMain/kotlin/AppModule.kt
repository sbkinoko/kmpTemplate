import org.koin.dsl.module
import repository.GoodMorningRepository
import repository.GreetingRepository
import usecase.GoodMorningUseCase

val AppModule = module {
    single<GreetingRepository> {
        GoodMorningRepository()
    }

    single {
        GoodMorningUseCase(get())
    }
}
