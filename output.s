.text
.type qpow, @function
.p2align 2
.globl qpow
qpow:
	addi sp, sp, -176
	sw ra, 0(sp)
	sw a0, 4(sp)
	sw a1, 8(sp)
	sw a2, 12(sp)
	addi t5, sp, 20
	sw t5, 16(sp)
	addi t5, sp, 28
	sw t5, 24(sp)
	addi t5, sp, 36
	sw t5, 32(sp)
	addi t5, sp, 44
	sw t5, 40(sp)
	addi t5, sp, 52
	sw t5, 48(sp)
	lw t0, 4(sp)
	lw t1, 16(sp)
	sw t0, 0(t1)
	lw t0, 8(sp)
	lw t1, 24(sp)
	sw t0, 0(t1)
	lw t0, 12(sp)
	lw t1, 32(sp)
	sw t0, 0(t1)
	li t0, 1
	lw t1, 40(sp)
	sw t0, 0(t1)
	lw t0, 16(sp)
	lw t1, 0(t0)
	sw t1, 56(sp)
	lw t0, 56(sp)
	lw t1, 48(sp)
	sw t0, 0(t1)
	j B1.label_loop_0

B1.label_loop_0:
	lw t0, 24(sp)
	lw t1, 0(t0)
	sw t1, 60(sp)
	lw t1, 60(sp)
	li t2, 0
	slt t0, t2, t1
	sw t0, 64(sp)
	lw t0, 64(sp)
	bnez t0, B1.label_body_2
	j B1.label_skip_1

B1.label_body_2:
	lw t0, 24(sp)
	lw t1, 0(t0)
	sw t1, 68(sp)
	lw t1, 68(sp)
	li t2, 1
	and t0, t1, t2
	sw t0, 72(sp)
	lw t1, 72(sp)
	li t2, 1
	xor t3, t1, t2
	sltiu t0, t3, 1
	sw t0, 76(sp)
	lw t0, 76(sp)
	bnez t0, B1.label_true_3
	j B1.label_false_4

B1.label_true_3:
	lw t0, 40(sp)
	lw t1, 0(t0)
	sw t1, 80(sp)
	lw t0, 48(sp)
	lw t1, 0(t0)
	sw t1, 84(sp)
	lw t1, 80(sp)
	lw t2, 84(sp)
	mul t0, t1, t2
	sw t0, 88(sp)
	lw t0, 32(sp)
	lw t1, 0(t0)
	sw t1, 92(sp)
	lw t1, 88(sp)
	lw t2, 92(sp)
	rem t0, t1, t2
	sw t0, 96(sp)
	lw t0, 96(sp)
	lw t1, 40(sp)
	sw t0, 0(t1)
	j B1.label_skip_5

B1.label_false_4:
	j B1.label_skip_5

B1.label_skip_5:
	lw t0, 48(sp)
	lw t1, 0(t0)
	sw t1, 100(sp)
	lw t0, 48(sp)
	lw t1, 0(t0)
	sw t1, 104(sp)
	lw t1, 100(sp)
	lw t2, 104(sp)
	mul t0, t1, t2
	sw t0, 108(sp)
	lw t0, 32(sp)
	lw t1, 0(t0)
	sw t1, 112(sp)
	lw t1, 108(sp)
	lw t2, 112(sp)
	rem t0, t1, t2
	sw t0, 116(sp)
	lw t0, 116(sp)
	lw t1, 48(sp)
	sw t0, 0(t1)
	lw t0, 24(sp)
	lw t1, 0(t0)
	sw t1, 120(sp)
	lw t1, 120(sp)
	li t2, 2
	div t0, t1, t2
	sw t0, 124(sp)
	lw t0, 124(sp)
	lw t1, 24(sp)
	sw t0, 0(t1)
	j B1.label_loop_0

B1.label_skip_1:
	lw t0, 40(sp)
	lw t1, 0(t0)
	sw t1, 128(sp)
	lw a0, 128(sp)
	lw ra, 0(sp)
	addi sp, sp, 176
	ret


.type main, @function
.p2align 2
.globl main
main:
	addi sp, sp, -48
	sw ra, 0(sp)
	call .init
	li a0, 2
	li a1, 10
	li a2, 10000
	call qpow
	sw a0, 4(sp)
	lw a0, 4(sp)
	call toString
	sw a0, 8(sp)
	lw a0, 8(sp)
	call println
	li a0, 0
	lw ra, 0(sp)
	addi sp, sp, 48
	ret


.type .init, @function
.p2align 2
.globl .init
.init:
	addi sp, sp, -48
	sw ra, 0(sp)
	lw ra, 0(sp)
	addi sp, sp, 48
	ret


.section .data
.section .rodata
