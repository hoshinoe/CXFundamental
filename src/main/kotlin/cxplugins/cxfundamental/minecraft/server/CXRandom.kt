package cxplugins.cxfundamental.minecraft.server

import java.util.ArrayList
import java.util.Random

/**
 * ΪһЩ����������ṩ����
 *
 */
class CXRandom : Random() {
    internal inner class CXPrepositionException : Exception() {


    }

    /**
     * ��̬����
     *
     */
    companion object {
        /**
         * ���б���������һ��������Ԫ��
         *  @param EList ���б�
         *  @param Amount ���������
         */
        @JvmStatic
        fun <Value> randomList(EList: MutableList<Value>, Amount: Int): List<Value> {
            val Result = ArrayList<Value>()
            val s = EList.size
            val Rand = Random()
            for (i in 0 until Amount) {
                if (EList.size > 0) {
                    val Place = Rand.nextInt(EList.size)
                    Result.add(EList[Place])
                    EList.removeAt(Place)
                } else {
                    val Place = Rand.nextInt(s)
                    Result.add(Result[Place])
                }
            }
            return Result

        }

        /**
         * ���һ����ĳ����Χ�������
         *
         * @param min ��Χ��Сֵ
         * @param max ��Χ���ֵ
         * @return
         */
        @JvmStatic
        fun nextInteger(min: Int, max: Int): Int {
            val result: Int
            result = (Math.random() * (max - min + 1) + min).toInt()
            return result
        }
        /**
         * ���һ����ĳ����Χ�����
         *
         * @param min ��Χ��Сֵ
         * @param max ��Χ���ֵ
         * @return
         */
        @JvmStatic
        fun nextDouble(min: Double, max: Double): Double {
            return Math.random() * (max - min + 1) + min
        }

        /**
         * ģ��һ�γ齱����
         *
         * @param Probability ����
         * @return ������ �򷵻�true ���򷵻�false
         */
        @JvmStatic
        fun lottery(Probability: Double): Boolean {
            val t = Random().nextInt(100)
            return if (Probability > t)
                true
            else
                false
        }
    }
}