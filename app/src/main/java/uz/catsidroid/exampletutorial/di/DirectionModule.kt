package uz.catsidroid.exampletutorial.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.catsidroid.exampletutorial.presentation.add.AddDirection
import uz.catsidroid.exampletutorial.presentation.add.AddDirectionImpl
import uz.catsidroid.exampletutorial.presentation.main.MainDirection
import uz.catsidroid.exampletutorial.presentation.main.MainDirectionImpl
import javax.inject.Singleton


@Module
@InstallIn(ViewModelComponent::class)
interface DirectionModule {

    @Binds
    fun bindMainDirection(bind:MainDirectionImpl) : MainDirection

    @Binds
    fun bindAddDirection(impl: AddDirectionImpl): AddDirection

   // @Binds
  //  fun bindEditDirection(impl: EditDirectionImpl): EditDirection
}