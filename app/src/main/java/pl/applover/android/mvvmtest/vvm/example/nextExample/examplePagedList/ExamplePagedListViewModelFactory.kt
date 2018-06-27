package pl.applover.android.mvvmtest.vvm.example.nextExample.examplePagedList

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import pl.applover.android.mvvmtest.data.example.repositories.ExampleCitiesRepository
import pl.applover.android.mvvmtest.util.other.SchedulerProvider
import javax.inject.Inject

/**
 * Created by Janusz Hain on 2018-06-06.
 */
class ExamplePagedListViewModelFactory @Inject constructor(private val router: ExamplePagedListFragmentRouter,
                                                           private val schedulerProvider: SchedulerProvider,
                                                           private val repository: ExampleCitiesRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ExamplePagedListViewModel(router, schedulerProvider, repository) as T
    }
}