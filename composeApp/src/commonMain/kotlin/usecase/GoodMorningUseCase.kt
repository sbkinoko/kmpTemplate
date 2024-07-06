package usecase

import repository.GreetingRepository

class GoodMorningUseCase(
    private val repository: GreetingRepository
) {
    fun invoke(): String {
        return repository.greeting()
    }
}
