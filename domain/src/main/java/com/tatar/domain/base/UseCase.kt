package com.tatar.domain.base

import com.tatar.core.result.Result

abstract class UseCase<A : UseCase.Arg, E : Entity> {

    open class Arg

    abstract suspend operator fun invoke(arg: A): Result<E>

    abstract class NoArg<E : Entity> {
        abstract suspend operator fun invoke(): Result<E>
    }

    abstract class Completable<A : Arg> {
        abstract suspend operator fun invoke(arg: A): Result<Unit>

        abstract class NoArg {
            abstract suspend operator fun invoke(): Result<Unit>
        }
    }
}