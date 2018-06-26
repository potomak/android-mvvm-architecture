package pl.applover.android.mvvmtest.adapters.cities

import android.support.v7.widget.RecyclerView
import pl.applover.android.mvvmtest.databinding.ExampleItemCityBinding
import pl.applover.android.mvvmtest.models.example.ExampleCityModel

/**
 * Created by Janusz Hain on 2018-06-20.
 */

/**
 * ViewHolder with DataBinding. It is easier to manage what few ViewHolders show than to search for position in the list to notify adapter
 */
class ExampleCityViewHolder(private val binding: ExampleItemCityBinding) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.holder = this
    }

    fun bind(city: ExampleCityModel) {
        binding.city = city
    }

    fun onClick(city: ExampleCityModel
    ) {
        city.numberOfClicks++
    }

}