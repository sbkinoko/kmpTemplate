package viewmodel

import org.koin.core.component.KoinComponent
import usecase.GoodMorningUseCase

class KmpViewModel(
    private val useCase: GoodMorningUseCase,
) : KoinComponent {
    val greeting: String
        get() = useCase()
}
