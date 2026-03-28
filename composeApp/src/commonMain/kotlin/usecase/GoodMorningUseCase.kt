package usecase

import repository.greeting.GreetingRepository

class GoodMorningUseCase(
    private val repository: GreetingRepository
) {
    operator fun invoke(): String {
        return repository.greeting()
    }
}
