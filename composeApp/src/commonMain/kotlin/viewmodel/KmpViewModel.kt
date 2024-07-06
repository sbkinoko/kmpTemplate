package viewmodel

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import usecase.GoodMorningUseCase

class KmpViewModel : KoinComponent {
    private val useCase: GoodMorningUseCase by inject()

    val greeting: String
        get() = useCase.invoke()
}
