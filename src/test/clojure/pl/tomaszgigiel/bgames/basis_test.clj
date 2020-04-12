(ns pl.tomaszgigiel.bgames.basis-test
  (:require [clojure.test :as tst])
  (:require [pl.tomaszgigiel.bgames.test-config :as test-config])
  (:require [pl.tomaszgigiel.utils.misc :as misc]))

(tst/use-fixtures :once test-config/once-fixture)
(tst/use-fixtures :each test-config/each-fixture)
