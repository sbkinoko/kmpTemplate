package repository.count

import domain.Counter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

class CountRepositoryImpl : CountRepository {
    override val mutableCountFlow = MutableSharedFlow<Int>(
        replay = 1,
    )

    private val counter: Counter = Counter()

    override var count: Int = 0
        set(value) {
            field = value
            CoroutineScope(Dispatchers.Default).launch {
                mutableCountFlow.emit(value)
            }
        }

    init {
        count = counter.count
    }
}
