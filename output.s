.text
.type qsrt, @function
.p2align 2
.globl qsrt
qsrt:
	addi sp, sp, -112
	sw ra, 0(sp)
	sw a0, 4(sp)
	sw a1, 8(sp)
	la t0, a
	lw t1, 0(t0)
	mv a0, t1
	lw t1, 4(sp)
	lw t2, 8(sp)
	add t0, t1, t2
	mv a1, t0
	mv t1, a1
	li t2, 2
	div t0, t1, t2
	mv a1, t0
	mv t0, a0
	mv t1, a1
	slli t1, t1, 2
	add t2, t0, t1
	mv a0, t2
	mv t0, a0
	lw t1, 0(t0)
	mv a0, t1
	li t0, 0
	mv a1, t0
	lw t0, 8(sp)
	mv a2, t0
	lw t0, 4(sp)
	mv a3, t0
	j B1.label_loop_0

B1.label_loop_0:
	mv a4, a3
	mv a5, a2
	mv a6, a1
	mv t1, a4
	mv t2, a5
	slt t0, t2, t1
	xori t0, t0, 1
	mv a7, t0
	mv t0, a7
	bnez t0, B1.label_body_2
	j B1.label_skip_1

B1.label_body_2:
	mv a7, a4
	j B1.label_loop_3

B1.label_loop_3:
	mv s0, a7
	la t0, a
	lw t1, 0(t0)
	mv s1, t1
	mv t0, s1
	mv t1, s0
	slli t1, t1, 2
	add t2, t0, t1
	mv s1, t2
	mv t0, s1
	lw t1, 0(t0)
	mv s1, t1
	mv t1, s1
	mv t2, a0
	slt t0, t1, t2
	mv s1, t0
	mv t0, s1
	bnez t0, B1.label_body_5
	j B1.label_skip_4

B1.label_body_5:
	mv t1, s0
	li t2, 1
	add t0, t1, t2
	mv s1, t0
	mv a7, s1
	j B1.label_loop_3

B1.label_skip_4:
	mv a7, a5
	j B1.label_loop_6

B1.label_loop_6:
	mv s1, a7
	la t0, a
	lw t1, 0(t0)
	mv s2, t1
	mv t0, s2
	mv t1, s1
	slli t1, t1, 2
	add t2, t0, t1
	mv s2, t2
	mv t0, s2
	lw t1, 0(t0)
	mv s2, t1
	mv t1, s2
	mv t2, a0
	slt t0, t2, t1
	mv s2, t0
	mv t0, s2
	bnez t0, B1.label_body_8
	j B1.label_skip_7

B1.label_body_8:
	mv t1, s1
	li t2, 1
	sub t0, t1, t2
	mv s2, t0
	mv a7, s2
	j B1.label_loop_6

B1.label_skip_7:
	mv t1, s0
	mv t2, s1
	slt t0, t2, t1
	xori t0, t0, 1
	mv a7, t0
	mv t0, a7
	bnez t0, B1.label_true_9
	j B1.label_false_10

B1.label_true_9:
	la t0, a
	lw t1, 0(t0)
	mv a6, t1
	mv t0, a6
	mv t1, s0
	slli t1, t1, 2
	add t2, t0, t1
	mv a6, t2
	mv t0, a6
	lw t1, 0(t0)
	mv a6, t1
	la t0, a
	lw t1, 0(t0)
	mv a7, t1
	mv t0, a7
	mv t1, s0
	slli t1, t1, 2
	add t2, t0, t1
	mv a7, t2
	la t0, a
	lw t1, 0(t0)
	mv s2, t1
	mv t0, s2
	mv t1, s1
	slli t1, t1, 2
	add t2, t0, t1
	mv s2, t2
	mv t0, s2
	lw t1, 0(t0)
	mv s2, t1
	mv t0, s2
	mv t1, a7
	sw t0, 0(t1)
	la t0, a
	lw t1, 0(t0)
	mv a7, t1
	mv t0, a7
	mv t1, s1
	slli t1, t1, 2
	add t2, t0, t1
	mv a7, t2
	mv t0, a6
	mv t1, a7
	sw t0, 0(t1)
	mv t1, s0
	li t2, 1
	add t0, t1, t2
	mv a7, t0
	mv t1, s1
	li t2, 1
	sub t0, t1, t2
	mv s2, t0
	mv a6, a6
	mv s2, s2
	mv a7, a7
	j B1.label_skip_11

B1.label_false_10:
	mv a6, a6
	mv s2, s1
	mv a7, s0
	j B1.label_skip_11

B1.label_skip_11:
	mv a7, a7
	mv s0, s2
	mv a6, a6
	mv a1, a6
	mv a2, s0
	mv a3, a7
	j B1.label_loop_0

B1.label_skip_1:
	lw t1, 4(sp)
	mv t2, a5
	slt t0, t1, t2
	mv a0, t0
	mv t0, a0
	bnez t0, B1.label_true_12
	j B1.label_false_13

B1.label_true_12:
	sw a0, 104(sp)
	sw a1, 100(sp)
	sw a2, 96(sp)
	sw a3, 92(sp)
	sw a4, 88(sp)
	sw a5, 84(sp)
	sw a6, 80(sp)
	sw a7, 76(sp)
	sw s0, 72(sp)
	sw s1, 68(sp)
	sw s2, 64(sp)
	sw s3, 60(sp)
	sw s4, 56(sp)
	sw s5, 52(sp)
	sw s6, 48(sp)
	sw s7, 44(sp)
	sw s8, 40(sp)
	sw s9, 36(sp)
	sw s10, 32(sp)
	sw s11, 28(sp)
	lw a0, 4(sp)
	lw t0, 84(sp)
	mv a1, t0
	call qsrt
	mv t0, a0
	lw a0, 104(sp)
	lw a1, 100(sp)
	lw a2, 96(sp)
	lw a3, 92(sp)
	lw a4, 88(sp)
	lw a5, 84(sp)
	lw a6, 80(sp)
	lw a7, 76(sp)
	lw s0, 72(sp)
	lw s1, 68(sp)
	lw s2, 64(sp)
	lw s3, 60(sp)
	lw s4, 56(sp)
	lw s5, 52(sp)
	lw s6, 48(sp)
	lw s7, 44(sp)
	lw s8, 40(sp)
	lw s9, 36(sp)
	lw s10, 32(sp)
	lw s11, 28(sp)
	j B1.label_skip_14

B1.label_false_13:
	j B1.label_skip_14

B1.label_skip_14:
	mv t1, a4
	lw t2, 8(sp)
	slt t0, t1, t2
	mv a0, t0
	mv t0, a0
	bnez t0, B1.label_true_15
	j B1.label_false_16

B1.label_true_15:
	sw a0, 104(sp)
	sw a1, 100(sp)
	sw a2, 96(sp)
	sw a3, 92(sp)
	sw a4, 88(sp)
	sw a5, 84(sp)
	sw a6, 80(sp)
	sw a7, 76(sp)
	sw s0, 72(sp)
	sw s1, 68(sp)
	sw s2, 64(sp)
	sw s3, 60(sp)
	sw s4, 56(sp)
	sw s5, 52(sp)
	sw s6, 48(sp)
	sw s7, 44(sp)
	sw s8, 40(sp)
	sw s9, 36(sp)
	sw s10, 32(sp)
	sw s11, 28(sp)
	lw t0, 88(sp)
	mv a0, t0
	lw a1, 8(sp)
	call qsrt
	mv t0, a0
	lw a0, 104(sp)
	lw a1, 100(sp)
	lw a2, 96(sp)
	lw a3, 92(sp)
	lw a4, 88(sp)
	lw a5, 84(sp)
	lw a6, 80(sp)
	lw a7, 76(sp)
	lw s0, 72(sp)
	lw s1, 68(sp)
	lw s2, 64(sp)
	lw s3, 60(sp)
	lw s4, 56(sp)
	lw s5, 52(sp)
	lw s6, 48(sp)
	lw s7, 44(sp)
	lw s8, 40(sp)
	lw s9, 36(sp)
	lw s10, 32(sp)
	lw s11, 28(sp)
	j B1.label_skip_17

B1.label_false_16:
	j B1.label_skip_17

B1.label_skip_17:
	li a0, 0
	lw ra, 0(sp)
	addi sp, sp, 112
	ret


.type main, @function
.p2align 2
.globl main
main:
	addi sp, sp, -96
	sw ra, 0(sp)
	sw a0, 88(sp)
	sw a1, 84(sp)
	sw a2, 80(sp)
	sw a3, 76(sp)
	sw a4, 72(sp)
	sw a5, 68(sp)
	sw a6, 64(sp)
	sw a7, 60(sp)
	sw s0, 56(sp)
	sw s1, 52(sp)
	sw s2, 48(sp)
	sw s3, 44(sp)
	sw s4, 40(sp)
	sw s5, 36(sp)
	sw s6, 32(sp)
	sw s7, 28(sp)
	sw s8, 24(sp)
	sw s9, 20(sp)
	sw s10, 16(sp)
	sw s11, 12(sp)
	call .init
	lw a0, 88(sp)
	lw a1, 84(sp)
	lw a2, 80(sp)
	lw a3, 76(sp)
	lw a4, 72(sp)
	lw a5, 68(sp)
	lw a6, 64(sp)
	lw a7, 60(sp)
	lw s0, 56(sp)
	lw s1, 52(sp)
	lw s2, 48(sp)
	lw s3, 44(sp)
	lw s4, 40(sp)
	lw s5, 36(sp)
	lw s6, 32(sp)
	lw s7, 28(sp)
	lw s8, 24(sp)
	lw s9, 20(sp)
	lw s10, 16(sp)
	lw s11, 12(sp)
	li t0, 1
	mv a0, t0
	j B2.label_loop_20

B2.label_loop_20:
	mv a1, a0
	la t0, n
	lw t1, 0(t0)
	mv a2, t1
	mv t1, a1
	mv t2, a2
	slt t0, t2, t1
	xori t0, t0, 1
	mv a2, t0
	mv t0, a2
	bnez t0, B2.label_body_21
	j B2.label_skip_19

B2.label_body_21:
	la t0, a
	lw t1, 0(t0)
	mv a2, t1
	mv t0, a2
	mv t1, a1
	slli t1, t1, 2
	add t2, t0, t1
	mv a2, t2
	la t0, n
	lw t1, 0(t0)
	mv a3, t1
	mv t1, a3
	li t2, 1
	add t0, t1, t2
	mv a3, t0
	mv t1, a3
	mv t2, a1
	sub t0, t1, t2
	mv a3, t0
	mv t0, a3
	mv t1, a2
	sw t0, 0(t1)
	j B2.label_step_18

B2.label_step_18:
	mv t1, a1
	li t2, 1
	add t0, t1, t2
	mv a1, t0
	mv a0, a1
	j B2.label_loop_20

B2.label_skip_19:
	la t0, n
	lw t1, 0(t0)
	mv a0, t1
	sw a0, 88(sp)
	sw a1, 84(sp)
	sw a2, 80(sp)
	sw a3, 76(sp)
	sw a4, 72(sp)
	sw a5, 68(sp)
	sw a6, 64(sp)
	sw a7, 60(sp)
	sw s0, 56(sp)
	sw s1, 52(sp)
	sw s2, 48(sp)
	sw s3, 44(sp)
	sw s4, 40(sp)
	sw s5, 36(sp)
	sw s6, 32(sp)
	sw s7, 28(sp)
	sw s8, 24(sp)
	sw s9, 20(sp)
	sw s10, 16(sp)
	sw s11, 12(sp)
	li a0, 1
	lw t0, 88(sp)
	mv a1, t0
	call qsrt
	mv t0, a0
	lw a0, 88(sp)
	lw a1, 84(sp)
	lw a2, 80(sp)
	lw a3, 76(sp)
	lw a4, 72(sp)
	lw a5, 68(sp)
	lw a6, 64(sp)
	lw a7, 60(sp)
	lw s0, 56(sp)
	lw s1, 52(sp)
	lw s2, 48(sp)
	lw s3, 44(sp)
	lw s4, 40(sp)
	lw s5, 36(sp)
	lw s6, 32(sp)
	lw s7, 28(sp)
	lw s8, 24(sp)
	lw s9, 20(sp)
	lw s10, 16(sp)
	lw s11, 12(sp)
	li t0, 1
	mv a0, t0
	j B2.label_loop_24

B2.label_loop_24:
	mv a1, a0
	la t0, n
	lw t1, 0(t0)
	mv a2, t1
	mv t1, a1
	mv t2, a2
	slt t0, t2, t1
	xori t0, t0, 1
	mv a2, t0
	mv t0, a2
	bnez t0, B2.label_body_25
	j B2.label_skip_23

B2.label_body_25:
	la t0, a
	lw t1, 0(t0)
	mv a2, t1
	mv t0, a2
	mv t1, a1
	slli t1, t1, 2
	add t2, t0, t1
	mv a2, t2
	mv t0, a2
	lw t1, 0(t0)
	mv a2, t1
	sw a0, 88(sp)
	sw a1, 84(sp)
	sw a2, 80(sp)
	sw a3, 76(sp)
	sw a4, 72(sp)
	sw a5, 68(sp)
	sw a6, 64(sp)
	sw a7, 60(sp)
	sw s0, 56(sp)
	sw s1, 52(sp)
	sw s2, 48(sp)
	sw s3, 44(sp)
	sw s4, 40(sp)
	sw s5, 36(sp)
	sw s6, 32(sp)
	sw s7, 28(sp)
	sw s8, 24(sp)
	sw s9, 20(sp)
	sw s10, 16(sp)
	sw s11, 12(sp)
	lw t0, 80(sp)
	mv a0, t0
	call toString
	mv t0, a0
	lw a0, 88(sp)
	lw a1, 84(sp)
	lw a2, 80(sp)
	lw a3, 76(sp)
	lw a4, 72(sp)
	lw a5, 68(sp)
	lw a6, 64(sp)
	lw a7, 60(sp)
	lw s0, 56(sp)
	lw s1, 52(sp)
	lw s2, 48(sp)
	lw s3, 44(sp)
	lw s4, 40(sp)
	lw s5, 36(sp)
	lw s6, 32(sp)
	lw s7, 28(sp)
	lw s8, 24(sp)
	lw s9, 20(sp)
	lw s10, 16(sp)
	lw s11, 12(sp)
	mv a2, t0
	sw a0, 88(sp)
	sw a1, 84(sp)
	sw a2, 80(sp)
	sw a3, 76(sp)
	sw a4, 72(sp)
	sw a5, 68(sp)
	sw a6, 64(sp)
	sw a7, 60(sp)
	sw s0, 56(sp)
	sw s1, 52(sp)
	sw s2, 48(sp)
	sw s3, 44(sp)
	sw s4, 40(sp)
	sw s5, 36(sp)
	sw s6, 32(sp)
	sw s7, 28(sp)
	sw s8, 24(sp)
	sw s9, 20(sp)
	sw s10, 16(sp)
	sw s11, 12(sp)
	lw t0, 80(sp)
	mv a0, t0
	call print
	lw a0, 88(sp)
	lw a1, 84(sp)
	lw a2, 80(sp)
	lw a3, 76(sp)
	lw a4, 72(sp)
	lw a5, 68(sp)
	lw a6, 64(sp)
	lw a7, 60(sp)
	lw s0, 56(sp)
	lw s1, 52(sp)
	lw s2, 48(sp)
	lw s3, 44(sp)
	lw s4, 40(sp)
	lw s5, 36(sp)
	lw s6, 32(sp)
	lw s7, 28(sp)
	lw s8, 24(sp)
	lw s9, 20(sp)
	lw s10, 16(sp)
	lw s11, 12(sp)
	sw a0, 88(sp)
	sw a1, 84(sp)
	sw a2, 80(sp)
	sw a3, 76(sp)
	sw a4, 72(sp)
	sw a5, 68(sp)
	sw a6, 64(sp)
	sw a7, 60(sp)
	sw s0, 56(sp)
	sw s1, 52(sp)
	sw s2, 48(sp)
	sw s3, 44(sp)
	sw s4, 40(sp)
	sw s5, 36(sp)
	sw s6, 32(sp)
	sw s7, 28(sp)
	sw s8, 24(sp)
	sw s9, 20(sp)
	sw s10, 16(sp)
	sw s11, 12(sp)
	la a0, .str.pre_0
	call print
	lw a0, 88(sp)
	lw a1, 84(sp)
	lw a2, 80(sp)
	lw a3, 76(sp)
	lw a4, 72(sp)
	lw a5, 68(sp)
	lw a6, 64(sp)
	lw a7, 60(sp)
	lw s0, 56(sp)
	lw s1, 52(sp)
	lw s2, 48(sp)
	lw s3, 44(sp)
	lw s4, 40(sp)
	lw s5, 36(sp)
	lw s6, 32(sp)
	lw s7, 28(sp)
	lw s8, 24(sp)
	lw s9, 20(sp)
	lw s10, 16(sp)
	lw s11, 12(sp)
	j B2.label_step_22

B2.label_step_22:
	mv t1, a1
	li t2, 1
	add t0, t1, t2
	mv a1, t0
	mv a0, a1
	j B2.label_loop_24

B2.label_skip_23:
	sw a0, 88(sp)
	sw a1, 84(sp)
	sw a2, 80(sp)
	sw a3, 76(sp)
	sw a4, 72(sp)
	sw a5, 68(sp)
	sw a6, 64(sp)
	sw a7, 60(sp)
	sw s0, 56(sp)
	sw s1, 52(sp)
	sw s2, 48(sp)
	sw s3, 44(sp)
	sw s4, 40(sp)
	sw s5, 36(sp)
	sw s6, 32(sp)
	sw s7, 28(sp)
	sw s8, 24(sp)
	sw s9, 20(sp)
	sw s10, 16(sp)
	sw s11, 12(sp)
	la a0, .str.pre_1
	call print
	lw a0, 88(sp)
	lw a1, 84(sp)
	lw a2, 80(sp)
	lw a3, 76(sp)
	lw a4, 72(sp)
	lw a5, 68(sp)
	lw a6, 64(sp)
	lw a7, 60(sp)
	lw s0, 56(sp)
	lw s1, 52(sp)
	lw s2, 48(sp)
	lw s3, 44(sp)
	lw s4, 40(sp)
	lw s5, 36(sp)
	lw s6, 32(sp)
	lw s7, 28(sp)
	lw s8, 24(sp)
	lw s9, 20(sp)
	lw s10, 16(sp)
	lw s11, 12(sp)
	li a0, 0
	lw ra, 0(sp)
	addi sp, sp, 96
	ret


.type .init, @function
.p2align 2
.globl .init
.init:
	addi sp, sp, -96
	sw ra, 0(sp)
	sw a0, 88(sp)
	sw a1, 84(sp)
	sw a2, 80(sp)
	sw a3, 76(sp)
	sw a4, 72(sp)
	sw a5, 68(sp)
	sw a6, 64(sp)
	sw a7, 60(sp)
	sw s0, 56(sp)
	sw s1, 52(sp)
	sw s2, 48(sp)
	sw s3, 44(sp)
	sw s4, 40(sp)
	sw s5, 36(sp)
	sw s6, 32(sp)
	sw s7, 28(sp)
	sw s8, 24(sp)
	sw s9, 20(sp)
	sw s10, 16(sp)
	sw s11, 12(sp)
	li a0, 4
	li a1, 10100
	call .malloc_array
	mv t0, a0
	lw a0, 88(sp)
	lw a1, 84(sp)
	lw a2, 80(sp)
	lw a3, 76(sp)
	lw a4, 72(sp)
	lw a5, 68(sp)
	lw a6, 64(sp)
	lw a7, 60(sp)
	lw s0, 56(sp)
	lw s1, 52(sp)
	lw s2, 48(sp)
	lw s3, 44(sp)
	lw s4, 40(sp)
	lw s5, 36(sp)
	lw s6, 32(sp)
	lw s7, 28(sp)
	lw s8, 24(sp)
	lw s9, 20(sp)
	lw s10, 16(sp)
	lw s11, 12(sp)
	mv a0, t0
	mv t0, a0
	la t1, a
	sw t0, 0(t1)
	li t0, 10000
	la t1, n
	sw t0, 0(t1)
	lw ra, 0(sp)
	addi sp, sp, 96
	ret


.section .data
.p2align 4
.globl a
a:
	.word 0

.p2align 4
.globl n
n:
	.word 0

.section .rodata
.p2align 1
.globl .str.pre_0
.str.pre_0:
	.asciz " "

.p2align 1
.globl .str.pre_1
.str.pre_1:
	.asciz "\n"

