package bunyod.profunctors.infrastructure.clients

import bunyod.profunctors.domain.orders.orders.PaymentId
import bunyod.profunctors.domain.payment.payment.Payment

trait PaymentClient[F[_]] {

  def process(payment: Payment): F[PaymentId]

}